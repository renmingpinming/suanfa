package zhou.yi.thread;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: XiaoLang
 * @Date: 2019/2/15 15:05
 */
public class MyThreadPool {
    private int workerCount;
    private int corePoolSize;
    private BlockingQueue<Runnable> workQueue;
    private Set<Worker> workers;
    private volatile boolean RUNNING = true;

    public MyThreadPool(int corePoolSize) {
        this.corePoolSize = corePoolSize;
        workQueue = new LinkedBlockingQueue<>();
        workers = new HashSet<>();
    }

    public void execute(Runnable r) {
        if (workerCount < corePoolSize) {
            addWorker(r);
        } else {
            try {
                workQueue.put(r);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void addWorker(Runnable r) {
        workerCount++;
        Worker worker = new Worker(r);
        Thread t = worker.thread;
        workers.add(worker);
        t.start();
    }

    class Worker implements Runnable {
        Runnable task;
        Thread thread;

        public Worker(Runnable task) {
            this.task = task;
            this.thread = new Thread(this);
        }

        @Override
        public void run() {
            while (RUNNING) {
                Runnable task = this.task;
                // 执行当前的任务，所以把这个任务置空，以免造成死循环
                this.task = null;
                if (task != null || (task = getTask()) != null) {
                    task.run();
                }
            }
        }
    }

    private Runnable getTask() {
        Runnable r = null;
        try {
            r = workQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return r;
    }


    public static void main(String[] args) {
        MyThreadPool threadPool = new MyThreadPool(5);
        Runnable r = new Writer();
        for (int i = 0; i < 10; i++) {
            threadPool.execute(r);
        }
    }

}

class Writer implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " ");
    }
}
