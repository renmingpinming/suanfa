package zhou.yi.leetCode2.easy8;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/9 18:20
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * <p>
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * <p>
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "egg", t = "add"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: s = "paper", t = "title"
 * 输出: true
 * 说明:
 * 你可以假设 s 和 t 具有相同的长度。
 */
public class _205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        char charS;
        char charT;
        for (int i = 0; i < s.length(); i++) {
            charS = s.charAt(i);
            charT = t.charAt(i);
            //s中相同的值对应t中不同的值
            if (map.containsKey(charS)) {
                if (!map.get(charS).equals(charT)) {
                    return Boolean.FALSE;
                }
            } else {
                //两个s中的值对应t中同一个值
                if (map.containsValue(charT)) {
                    return Boolean.FALSE;
                }
                map.put(charS, charT);
            }
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        _205 test = new _205();
        String s = "paper";
        String t = "tiale";
        System.out.println(test.isIsomorphic(s, t));
    }
}
