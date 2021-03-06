package zhou.yi.leetCode2.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/12 18:47
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class _3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0, size = s.length(); i < size; i++) {
            int j = i;
            Set<Character> unique = new HashSet<>();
            while (j < size && unique.add(s.charAt(j))) {
                j++;
            }
            if (unique.size() > max) {
                max = unique.size();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        _3 test = new _3();
        int rst = test.lengthOfLongestSubstring("abcabcbb");
        System.out.println(rst);
    }
}
