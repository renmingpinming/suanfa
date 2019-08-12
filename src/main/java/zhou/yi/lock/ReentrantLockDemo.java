package zhou.yi.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/12 10:46
 */
public class ReentrantLockDemo {
    //产品类
    class Depot {
        private int size;
        private Lock lock;

        public Depot() {
            this.size = 0;
            this.lock = new ReentrantLock();
        }

        //生产
        public void produce(int newSize) {
            lock.lock();
            try {
                size += newSize;
                System.out.println(Thread.currentThread().getName() + "=====" + size);
            } finally {
                lock.unlock();
            }
        }

        public void consume(int newSize) {
            lock.lock();
            try {
                size -= newSize;
                System.out.println(Thread.currentThread().getName() + "=====" + size);
            } finally {
                lock.unlock();
            }
        }
    }

    //生产者
    class Producer {
        private Depot depot;

        public Producer(Depot depot) {
            this.depot = depot;
        }

        public void produce(final int newSize) {
            new Thread() {
                @Override
                public void run() {
                    depot.produce(newSize);
                }
            }.start();
        }
    }

    class Customer {
        private Depot depot;

        public Customer(Depot depot) {
            this.depot = depot;
        }

        public void consume(final int newSize) {
            new Thread() {
                @Override
                public void run() {
                    depot.consume(newSize);
                }
            }.start();
        }
    }

    public static void main(String[] args) {

        Depot depot = new ReentrantLockDemo().new Depot();
        Producer producer = new ReentrantLockDemo().new Producer(depot);
        Customer customer = new ReentrantLockDemo().new Customer(depot);

        producer.produce(60);
        producer.produce(120);
        customer.consume(90);
        customer.consume(150);
        producer.produce(110);
    }
}
