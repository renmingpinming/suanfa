package zhou.yi.leetCode2.easy10;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/22 18:35
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * <p>
 * 说明：不要使用任何内置的库函数，如  sqrt。
 * <p>
 * 示例 1：
 * <p>
 * 输入：16
 * 输出：True
 * 示例 2：
 * <p>
 * 输入：14
 * 输出：False
 */
public class _367 {
    public boolean isPerfectSquare(int num) {
        if (num <= 1) {
            return true;
        }
        long start = 0;
        long end = num;
        while (start <= end) {
            long mid = start + ((end - start) >> 1);
            long numTwo = mid * mid;
            if (numTwo == num) {
                return true;
            } else if (numTwo < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        _367 test = new _367();
        System.out.println(test.isPerfectSquare(2147483647));
        ;
    }
}
