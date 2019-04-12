package zhou.yi.lock;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/12 13:33
 */
public class WeakHashLock<T> {
    private ConcurrentHashMap<T, WeakLockRef<T, ReentrantLock>> lockMap = new ConcurrentHashMap<>();
    private ReferenceQueue<ReentrantLock> queue = new ReferenceQueue<>();

    public ReentrantLock get(T key) {
        if (lockMap.size() > 1000) {
            clearEmptyRef();
        }
        WeakReference<ReentrantLock> lockRef = lockMap.get(key);
        ReentrantLock lock = (lockRef == null ? null : lockRef.get());
        while (lock == null) {
            lockMap.putIfAbsent(key, new WeakLockRef<>(new ReentrantLock(), queue, key));
            lockRef = lockMap.get(key);
            lock = (lockRef == null ? null : lockRef.get());
            if (lock != null) {
                return lock;
            }
            clearEmptyRef();
        }
        return lock;
    }

    @SuppressWarnings("unchecked")
    private void clearEmptyRef() {
        Reference<? extends ReentrantLock> ref;
        while ((ref = queue.poll()) != null) {
            WeakLockRef<T, ? extends ReentrantLock> weakLockRef = (WeakLockRef<T, ? extends ReentrantLock>) ref;
            lockMap.remove(weakLockRef.key);
        }
    }

    private static final class WeakLockRef<T, K> extends WeakReference<K> {
        final T key;

        private WeakLockRef(K referent, ReferenceQueue<? super K> q, T key) {
            super(referent, q);
            this.key = key;
        }
    }

    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10,10,60L,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5));
        WeakHashLock<Character> lock = new WeakHashLock<>();
        String hello = "abcde";
        for(int i = 0; i < 10;i++){
            int finalI = new Random().nextInt(5);
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        lock.get(hello.charAt(finalI)).lock();
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + "---"+hello.charAt(finalI));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.get(hello.charAt(finalI)).unlock();
                    }
                }
            });
        }
        pool.shutdown();
    }
}
