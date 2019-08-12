package zhou.yi.leetCode.easy2;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/18 16:32
 */
public class _70 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        _70 test = new _70();
        System.out.println(test.climbStairs(44));
    }
}
