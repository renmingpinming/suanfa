package zhou.yi.leetCode.easy2;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/18 15:58
 * 牛顿迭代法求平方根
 * 实现 int sqrt(int Test) 函数。
 * <p>
 * 计算并返回 Test 的平方根，其中 Test 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 */
public class _69 {
    public int mySqrt(int x) {
        long n = x;
        while (n * n > x) {
            n = (n + x / n) >> 1;
        }
        return (int) n;
    }

    public static void main(String[] args) {
        _69 test = new _69();
        System.out.println(test.mySqrt(2147395600));
    }
}
