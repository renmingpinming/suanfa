package zhou.yi.leetCode2.easy9;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/20 17:09
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 * <p>
 * 输入: "leetcode"
 * 输出: "leotcede"
 */
public class _345 {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        Set<Character> charSet = new HashSet<>();
        charSet.add('a');
        charSet.add('o');
        charSet.add('e');
        charSet.add('i');
        charSet.add('u');
        charSet.add('A');
        charSet.add('O');
        charSet.add('E');
        charSet.add('I');
        charSet.add('U');
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (!charSet.contains(chars[i]) && i < j) {
                i++;
            }
            while (!charSet.contains(chars[j]) && i < j) {
                j--;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        _345 test = new _345();
        System.out.println(test.reverseVowels("leetcode"));
    }
}
