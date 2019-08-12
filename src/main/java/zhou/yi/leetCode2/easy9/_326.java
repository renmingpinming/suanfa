package zhou.yi.leetCode2.easy9;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/20 16:37
 * 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 16
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: 5
 * 输出: false
 */
public class _326 {
    public boolean isPowerOfThree(int n) {
        while (n > 0) {
            if (n == 1) {
                return Boolean.TRUE;
            }
            if (n % 3 != 0) {
                return Boolean.FALSE;
            }
            n = n / 3;
        }
        return Boolean.FALSE;
    }

    public boolean isPowerOfThree2(int n) {
        if (n < 1) {
            return false;
        }
        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return true;

    }

    public static void main(String[] args) {
        _326 test = new _326();
        System.out.println(test.isPowerOfThree(45));
    }
}
