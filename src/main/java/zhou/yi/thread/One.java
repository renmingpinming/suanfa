package zhou.yi.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/2/15 9:56
 */
public class One {
    static List<Integer> list = new ArrayList<>();

    static class BB implements Runnable {
        @Override
        public void run() {
            for (int j = 0; j < 100; j++) {
                list.add(j);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BB b = new BB();
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(list.size());
    }
}
