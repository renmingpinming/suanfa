package zhou.yi.leetCode.easy5;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/23 16:49
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 * 示例 2：
 * <p>
 * 输入：00000000000000000000000010000000
 * 输出：1
 * 解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
 * 示例 3：
 * <p>
 * 输入：11111111111111111111111111111101
 * 输出：31
 * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
 */
public class _191 {
    public int hammingWeight(int n) {
        int count = 0;
        int len = Integer.toBinaryString(n).length();
        for (int i = 1; i < len; i++) {

        }
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        _191 test = new _191();
        //由于长度超过Integer限制无法测试
        String s = "11111111111111111111111111111101";
        Integer n = Integer.parseInt(s, 2);
        System.out.println(test.hammingWeight(n));
    }
}
