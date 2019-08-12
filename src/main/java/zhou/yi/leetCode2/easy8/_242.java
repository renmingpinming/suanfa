package zhou.yi.leetCode2.easy8;

import java.util.Arrays;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/15 16:27
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 */
public class _242 {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return String.valueOf(sChars).equals(String.valueOf(tChars));
    }

    public static void main(String[] args) {
        _242 test = new _242();
        System.out.println(test.isAnagram("anagram", "nagaram"));
    }
}
