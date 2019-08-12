package zhou.yi.leetCode.easy5;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/23 14:30
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * <p>
 * 例如，
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * 示例 1:
 * <p>
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 * <p>
 * 输入: "ZY"
 * 输出: 701
 */
public class _171 {
    public int titleToNumber(String s) {
        int len = s.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            sum += (Math.pow(26, len - 1 - i) * ((s.charAt(i) - 'A' + 1)));
        }
        return sum;
    }

    public static void main(String[] args) {
        _171 test = new _171();
        System.out.println(test.titleToNumber("ZY"));
    }
}
