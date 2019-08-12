package zhou.yi.leetCode2.medium;

/**
 * @Author: XiaoLang
 * @Date: 2019/6/18 18:08
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class _5 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = getMaxLen(s, i, i);
            int len2 = getMaxLen(s, i, i + 1);
            int len = len1 > len2 ? len1 : len2;
            if (len > maxLen) {
                maxLen = len;
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        return s.substring(start, end + 1);
    }

    public int getMaxLen(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        _5 test = new _5();
        System.out.println(test.longestPalindrome("babad"));
    }
}
