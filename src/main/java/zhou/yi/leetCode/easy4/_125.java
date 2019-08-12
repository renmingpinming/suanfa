package zhou.yi.leetCode.easy4;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/22 16:43
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 */
public class _125 {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (!String.valueOf(s.charAt(i)).equalsIgnoreCase(String.valueOf(s.charAt(j)))) {
                return Boolean.FALSE;
            }
            i++;
            j--;
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        _125 test = new _125();
//        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
        String s = "1P";
        System.out.println(test.isPalindrome(s));
    }
}
