package zhou.yi.test;

import java.math.BigDecimal;

public class xxx {

    public static void main(String[] args){
//        String num = "12.000";
//        BigDecimal bd =new BigDecimal(num);
//        System.out.println(bd.longValue());
//        BigDecimal a = new BigDecimal(9L);
//        BigDecimal b = new BigDecimal(0L);
//        BigDecimal c = (a.subtract(b).divide(a,4, BigDecimal.ROUND_HALF_UP));
//        System.out.println(c);
//        BigDecimal x = b.divide(a);
//        System.out.println(x);
//        List<String> xxx = null;
//        int test1 = 8;
//        System.out.println(test1>>1);
        xxx x = new xxx();
         int[]a = {1,2,3,4};
         x.printPermutations(a, 4, 4);

    }

    // 调用方式：
// k 表示要处理的子数组的数据个数
    public void printPermutations(int[] data, int n, int k) {
        if (k == 1) {
            for (int i = 0; i < n; ++i) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < k; ++i) {
            int tmp = data[i];
            data[i] = data[k-1];
            data[k-1] = tmp;

            printPermutations(data, n, k - 1);

            tmp = data[i];
            data[i] = data[k-1];
            data[k-1] = tmp;
        }
    }

}
