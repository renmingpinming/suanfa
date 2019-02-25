package zhou.yi.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: XiaoLang
 * @Date: 2019/2/15 14:44
 */
public class ThreeThreadPrintABC {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition wait = lock.newCondition();
    // 用来控制该打印的线程
    private static int count = 0;

    public static void main(String[] args) {
        Thread printA = new Thread(new PrintA());
        Thread printB = new Thread(new PrintB());
        Thread printC = new Thread(new PrintC());
        printA.start();
        printB.start();
        printC.start();

    }

    static class PrintA implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    while ((count % 3) != 0) {
                        wait.await();
                    }
                    System.out.println(Thread.currentThread().getName() + " A");
                    count++;
                    wait.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    static class PrintB implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    while ((count % 3) != 1) {
                        wait.await();
                    }
                    System.out.println(Thread.currentThread().getName() + " B");
                    count++;
                    wait.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    static class PrintC implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    while ((count % 3) != 2) {
                        wait.await();
                    }
                    System.out.println(Thread.currentThread().getName() + " C");
                    count++;
                    wait.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
