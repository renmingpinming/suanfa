package zhou.yi.leetCode2.medium2;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/8 15:33
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * <p>
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 * <p>
 * 示例 1:
 * <p>
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * <p>
 * <p>
 * 思路 : 所有的数字都可以用二进制来表示
 * 计算过程如下
 * 100/2 = 2*32 + 2*16 + 2*2;
 * 32+16+2 = 50
 * 100/3 = 3*32 + 3*1
 * 32 + 1 = 33
 */
public class _29 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        Boolean flag = (dividend ^ divisor) >= 0;
        Long dividendL = Math.abs((long) dividend);
        Long divisorL = Math.abs((long) divisor);
        int rst = 0;
        for (int i = 31; i >= 0; i--) {
            if (dividendL >> i >= divisorL) {
                rst += (1 << i);
                dividendL -= divisorL << i;
            }
        }
        return flag ? rst : -rst;
    }

    public static void main(String[] args) {
        _29 test = new _29();
        int dividend = 7;
        int divisor = -3;
        System.out.println(test.divide(dividend, divisor));
    }
}
