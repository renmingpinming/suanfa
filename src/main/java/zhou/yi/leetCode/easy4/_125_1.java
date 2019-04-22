package zhou.yi.leetCode.easy4;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/22 17:04
 */
public class _125_1 {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        final String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        _125_1 test = new _125_1();
        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
//        String s = "1P";
        System.out.println(test.isPalindrome(s));
    }
}
