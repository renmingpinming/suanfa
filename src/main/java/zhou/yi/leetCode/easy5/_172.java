package zhou.yi.leetCode.easy5;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/23 14:49
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 * 示例 2:
 * <p>
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 */
public class _172 {
    public int trailingZeroes(int n) {
        int sum = 0;
        while (n > 0) {
            n /= 5;
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        _172 test = new _172();
        System.out.println(test.trailingZeroes(200));
    }
}
