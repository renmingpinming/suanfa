package zhou.yi.leetCode.easy;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/15 9:51
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class _9 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int length = str.length();
        for (int i = 0, max = length / 2; i < max; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        _9 test = new _9();
        int num = -121;
        System.out.println(test.isPalindrome(num));
    }
}
