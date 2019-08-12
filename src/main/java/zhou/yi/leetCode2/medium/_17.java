package zhou.yi.leetCode2.medium;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/6/27 18:01
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 示例:
 * <p>
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _17 {
    private String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits != null && digits.length() > 0) qaq(ans, "", digits);
        return ans;
    }

    public void qaq(List<String> ans, String cur, String digits) {
        if (cur.length() == digits.length()) {
            ans.add(cur);
            return;
        }
        int index = digits.charAt(cur.length()) - '0';
        for (int i = 0; i < map[index].length(); i++) {
            qaq(ans, cur + map[index].charAt(i), digits);
        }
    }

    public static void main(String[] args) {
        _17 test = new _17();
        System.out.println(test.letterCombinations("23"));
    }

}
