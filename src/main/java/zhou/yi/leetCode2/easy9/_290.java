package zhou.yi.leetCode2.easy9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/16 13:31
 * 给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。
 *
 * 这里的遵循指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。
 *
 * 示例1:
 *
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * 示例 2:
 *
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 * 示例 3:
 *
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 * 示例 4:
 *
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 */
public class _290 {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null || str == null || pattern.equals("")){
            return Boolean.FALSE;
        }
        String[] strs = str.split(" ");
        if(pattern.length() != strs.length){
            return Boolean.FALSE;
        }
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0;i < pattern.length();i++){
            map.putIfAbsent(pattern.charAt(i),i);
            if(!strs[i].equals(strs[map.get(pattern.charAt(i))]) ){
                return Boolean.FALSE;
            }
        }
        if(map.values().size() == 1){
            return Boolean.TRUE;
        }
        Iterator<Integer> iter = map.values().iterator();
        Integer temp = iter.next();
        while (iter.hasNext()){
            Integer now = iter.next();
            if(strs[temp].equals(strs[now])){
                return Boolean.FALSE;
            }
            temp = now;
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        _290 test = new _290();
        String pattern = "abba";
        String str = "dog dog dog dog";
        System.out.println(test.wordPattern(pattern,str));
    }
}
