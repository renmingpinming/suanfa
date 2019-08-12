package zhou.yi.test;

/**
 * @Author: XiaoLang
 * @Date: 2019/3/1 17:30
 */
public class Solution {
    public static int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (n != 0) && ((sum += Sum_Solution(n - 1)) > 0);
//        sum += n;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Sum_Solution(3));
    }
}
