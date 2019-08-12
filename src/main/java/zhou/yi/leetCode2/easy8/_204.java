package zhou.yi.leetCode2.easy8;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/9 18:03
 * 统计所有小于非负整数 n 的质数的数量。
 * <p>
 * 示例:
 * <p>
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class _204 {
    public int countPrimes(int n) {
        boolean[] isPrimes = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrimes[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            for (int j = i * i; j < n; j += i) {
                if (!isPrimes[j]) {
                    continue;
                }
                isPrimes[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimes[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        _204 test = new _204();
        System.out.println(test.countPrimes(5));
    }
}
