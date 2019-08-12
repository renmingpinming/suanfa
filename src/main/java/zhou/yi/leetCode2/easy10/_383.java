package zhou.yi.leetCode2.easy10;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/27 17:07
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 * <p>
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 * <p>
 * 注意：
 * <p>
 * 你可以假设两个字符串均只含有小写字母。
 * <p>
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */
public class _383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.length() == 0) {
            return true;
        }
        if (magazine == null || magazine.length() == 0) {
            return false;
        }
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            map.putIfAbsent(ransomNote.charAt(i), 0);
            map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            if (map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) - 1);
            }
        }
        for (Integer value : map.values()) {
            if (value > 0) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        int[] m = new int[26];
        for (int i = 0; i < magazine.length(); ++i)
            m[magazine.charAt(i) - 'a']++;
        for (int i = 0; i < ransomNote.length(); ++i)
            if (m[ransomNote.charAt(i) - 'a']-- <= 0) return false;
        return true;
    }


    public static void main(String[] args) {
        _383 test = new _383();
        String ransomNote = "bg";
        String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        System.out.println(test.canConstruct2(ransomNote, magazine));
    }
}
