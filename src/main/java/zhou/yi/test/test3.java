package zhou.yi.test;

import java.math.BigDecimal;
import java.util.PriorityQueue;

public class test3 {
    public static void main(String[] args){
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.offer("a");
        priorityQueue.offer("c");
        priorityQueue.offer("b");
        priorityQueue.offer("e");
        for (String s: priorityQueue) {
            System.out.print(s+",");
        }
        String x = priorityQueue.poll();
        String y = priorityQueue.poll();
        System.out.println("poll:"+x);
        System.out.println("poll:"+y);
        for (String s: priorityQueue) {
            System.out.print(s+",");
        }

        BigDecimal xxx = new BigDecimal(0.000);
        if(xxx.compareTo(BigDecimal.ZERO) == 0){
            int[]aa = {1,2,3,4};
        }
    }
}
