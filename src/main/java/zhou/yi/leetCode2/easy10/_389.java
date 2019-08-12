package zhou.yi.leetCode2.easy10;

/**
 * @Author: XiaoLang
 * @Date: 2019/6/15 9:39
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * <p>
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * <p>
 * 请找出在 t 中被添加的字母。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入：
 * s = "abcd"
 * t = "abcde"
 * <p>
 * 输出：
 * e
 * <p>
 * 解释：
 * 'e' 是那个被添加的字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _389 {
    public char findTheDifference(String s, String t) {
        int rst = 0;
        for (char c : s.toCharArray()) {
            rst ^= c;
        }
        for (char c : t.toCharArray()) {
            rst ^= c;
        }
        return (char) rst;
    }

    public static void main(String[] args) {
        _389 test = new _389();
        System.out.println(test.findTheDifference("abcd", "abcdf"));
    }
}
