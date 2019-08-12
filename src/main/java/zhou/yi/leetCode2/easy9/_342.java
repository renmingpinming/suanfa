package zhou.yi.leetCode2.easy9;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/20 16:50
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
public class _342 {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }
        while (num > 1) {
            if (num % 4 != 0) {
                return false;
            }
            num /= 4;
        }
        return true;
    }

    public static void main(String[] args) {
        _342 test = new _342();
        System.out.println(test.isPowerOfFour(16));
    }
}
