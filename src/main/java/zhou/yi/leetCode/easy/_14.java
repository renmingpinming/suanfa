package zhou.yi.leetCode.easy;


/**
 * @Author: XiaoLang
 * @Date: 2019/4/15 10:30
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
public class _14 {
    public String longestCommonPrefix(String[] strs) {
        String rst = "";
        int strsLen = strs.length;
        if (strsLen == 0) {
            return rst;
        }
        int minStrLen = strs[0].length();
        for (String s : strs) {
            if (s.length() < minStrLen) {
                minStrLen = s.length();
            }
        }
        for (int i = 0; i < minStrLen; i++) {
            for (int j = 0; j < strsLen - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    return rst;
                }
            }
            rst += strs[0].charAt(i);
        }
        return rst;
    }

    public static void main(String[] args) {
        _14 test = new _14();
//        String[] strs = new String[]{"flower","flow","flight"};
        String[] strs = new String[]{"dog", "racecar", "car"};
        System.out.println(test.longestCommonPrefix(strs));
    }
}
