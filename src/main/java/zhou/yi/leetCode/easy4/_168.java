package zhou.yi.leetCode.easy4;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/23 13:51
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 例如，
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * 示例 1:
 *
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 *
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 *
 * 输入: 701
 * 输出: "ZY"
 */
public class _168 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0){
            int index = n % 26;
            n = n / 26;
            if(index == 0){
                sb.insert(0,'Z');
                n--;
            }else {
                sb.insert(0,(char)('A'+ index - 1));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        _168 test = new _168();
        System.out.println(test.convertToTitle(701));
    }
}
