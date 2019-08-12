package zhou.yi.leetCode2.easy10;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/29 17:52
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 案例:
 * <p>
 * s = "leetcode"
 * 返回 0.
 * <p>
 * s = "loveleetcode",
 * 返回 2.
 */
public class _387 {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar2(String s) {
        int[] count = new int[26];   //定义一个数组用来存放每个字母出现的次数
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        _387 test = new _387();
        System.out.println(test.firstUniqChar("loveleetcode"));
    }
}
