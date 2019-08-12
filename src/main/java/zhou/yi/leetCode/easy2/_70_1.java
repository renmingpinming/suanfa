package zhou.yi.leetCode.easy2;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/18 16:51
 */
public class _70_1 {
    /**
     * 方法 3：动态规划
     * 算法
     * <p>
     * 不难发现，这个问题可以被分解为一些包含最优子结构的子问题，即它的最优解可以从其子问题的最优解来有效地构建，我们可以使用动态规划来解决这一问题。
     * <p>
     * 第 ii 阶可以由以下两种方法得到：
     * <p>
     * 在第 (i-1)(i−1) 阶后向上爬一阶。
     * <p>
     * 在第 (i-2)(i−2) 阶后向上爬 22 阶。
     * <p>
     * 所以到达第 ii 阶的方法总数就是到第 (i-1)(i−1) 阶和第 (i-2)(i−2) 阶的方法数之和。
     * <p>
     * 令 dp[i]dp[i] 表示能到达第 ii 阶的方法总数：
     * <p>
     * dp[i]=dp[i-1]+dp[i-2] dp[i]=dp[i−1]+dp[i−2]
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * 方法 4: 斐波那契数
     * 算法
     * <p>
     * 在上述方法中，我们使用 dpdp 数组，其中 dp[i]=dp[i-1]+dp[i-2]dp[i]=dp[i−1]+dp[i−2]。可以很容易通过分析得出 dp[i]dp[i] 其实就是第 ii 个斐波那契数。
     * <p>
     * Fib(n)=Fib(n-1)+Fib(n-2) Fib(n)=Fib(n−1)+Fib(n−2)
     * <p>
     * 现在我们必须找出以 11 和 22 作为第一项和第二项的斐波那契数列中的第 nn 个数，也就是说 Fib(1)=1Fib(1)=1 且 Fib(2)=2Fib(2)=2。
     *
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
