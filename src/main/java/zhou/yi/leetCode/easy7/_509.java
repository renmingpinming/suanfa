package zhou.yi.leetCode.easy7;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/5 18:07
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 给定 N，计算 F(N)。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：2
 * 输出：1
 * 解释：F(2) = F(1) + F(0) = 1 + 0 = 1.
 * 示例 2：
 * <p>
 * 输入：3
 * 输出：2
 * 解释：F(3) = F(2) + F(1) = 1 + 1 = 2.
 * 示例 3：
 * <p>
 * 输入：4
 * 输出：3
 * 解释：F(4) = F(3) + F(2) = 2 + 1 = 3.
 */
public class _509 {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public int fib2(int N) {
        if (N < 2) return N;
        int ans[] = new int[N + 1];
        ans[0] = 0;
        ans[1] = 1;
        for (int i = 2; i <= N; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[N];
    }

    public static void main(String[] args) {
        _509 test = new _509();
        System.out.println(test.fib(4));
    }
}
