package zhou.yi.thread;

/**
 * @Author: XiaoLang
 * @Date: 2019/2/15 14:33
 */
public class PrintOddEven {
    private static final Object lock = new Object();
    private static int count = 1;

    static class PrintOdd implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    try {
                        while ((count & 1) != 1) {
                            lock.wait();
                        }
                        System.out.println(Thread.currentThread().getName() + " " + count);
                        count++;
                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class PrintEven implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    try {
                        while ((count & 1) != 0) {
                            lock.wait();
                        }
                        System.out.println(Thread.currentThread().getName() + " " + count);
                        count++;
                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new PrintOdd()).start();
        new Thread(new PrintEven()).start();
    }
}
