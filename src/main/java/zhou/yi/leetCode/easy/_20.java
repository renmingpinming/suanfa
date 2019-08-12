package zhou.yi.leetCode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/16 9:15
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 */
public class _20 {
    public boolean isValid(String s) {
        if ((s.length() & 1) != 0) {
            return Boolean.FALSE;
        }
        Map<Character, Character> maps = new HashMap<>();
        maps.put(')', '(');
        maps.put('}', '{');
        maps.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0, len = s.length(); i < len; i++) {
            if (maps.containsKey(s.charAt(i))) {
                if (stack.isEmpty()) {
                    continue;
                }
                if (!stack.pop().equals(maps.get(s.charAt(i)))) {
                    return Boolean.FALSE;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        _20 test = new _20();
        String s = "((";
        System.out.println(test.isValid(s));
    }
}
