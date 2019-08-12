package zhou.yi.lock;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/12 11:25
 */
public class SegmentLock<T> {
    private Integer segments = 16;//默认分段数量
    private final HashMap<Integer, ReentrantLock> lockMap = new HashMap<>();

    public SegmentLock() {
        init(null, false);
    }

    public SegmentLock(Integer counts, boolean fair) {
        init(counts, fair);
    }

    private void init(Integer counts, boolean fair) {
        if (counts != null) {
            segments = counts;
        }
        for (int i = 0; i < segments; i++) {
            lockMap.put(i, new ReentrantLock(fair));
        }
    }

    public void lock(T key) {
        ReentrantLock lock = lockMap.get(key.hashCode() % segments);
        lock.lock();
    }

    public void unlock(T key) {
        ReentrantLock lock = lockMap.get(key.hashCode() % segments);
        lock.unlock();
    }

    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 10, 60L,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5));
        SegmentLock<Character> lock = new SegmentLock<>();
        String hello = "abcde";
        for (int i = 0; i < 10; i++) {
            int finalI = new Random().nextInt(5);
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        lock.lock(hello.charAt(finalI));
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + "---" + hello.charAt(finalI));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock(hello.charAt(finalI));
                    }
                }
            });
        }
        pool.shutdown();
    }
}
