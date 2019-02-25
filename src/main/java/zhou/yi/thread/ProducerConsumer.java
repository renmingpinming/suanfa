package zhou.yi.thread;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: XiaoLang
 * @Date: 2019/2/15 15:40
 */
public class ProducerConsumer {
    public static class Producer implements Runnable {
        private BlockingQueue<Integer> blockingQueue;
        private Random random = new Random();

        public Producer(BlockingQueue<Integer> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {
            while (true) {
                Integer a = makeProduct();
                try {
                    blockingQueue.put(a);
                    System.out.println(Thread.currentThread().getName() + "生产了" + a + " 队列大小" + blockingQueue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public Integer makeProduct() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return random.nextInt(10);
        }
    }

    public static class Consumer implements Runnable {
        private BlockingQueue<Integer> blockingQueue;

        public Consumer(BlockingQueue<Integer> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }


        @Override
        public void run() {
            while (true) {
                Integer a = useProduct();
                System.out.println(Thread.currentThread().getName() + "消费产品" + a + " 队列大小" + blockingQueue.size());
            }
        }

        public Integer useProduct() {
            Integer a = null;
            try {
                a = blockingQueue.take();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return a;
        }
    }

    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(5);
        ExecutorService exec = Executors.newCachedThreadPool();
        int producerNum = 3;
        int consumerNum = 5;

        for (int i = 0; i < producerNum; i++) {
            exec.submit(new Producer(blockingQueue));
        }
        for (int i = 0; i < consumerNum; i++) {
            exec.submit(new Consumer(blockingQueue));
        }

    }
}
