package zhou.yi.leetCode2.easy10;

/**
 * @Author: XiaoLang
 * @Date: 2019/6/15 9:58
 * 在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
 * <p>
 * 注意:
 * n 是正数且在32为整形范围内 ( n < 231)。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * 3
 * <p>
 * 输出:
 * 3
 * 示例 2:
 * <p>
 * 输入:
 * 11
 * <p>
 * 输出:
 * 0
 * <p>
 * 说明:
 * 第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/nth-digit
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _400 {
    public int findNthDigit(int n) {
        long len = 1, base = 1;
        long m = n;
        while (m > 9 * base * len) {
            m -= 9 * base * len;
            len++;
            base *= 10;
        }
        int curNum = (int) (base + (m - 1) / len);
        String y = curNum + "";
        int x = (int) (((m - 1) % len));
        int z = y.charAt(x);
        int zz = z - '0';
        return ((curNum + "").charAt((int) ((m - 1) % len)) - '0');
    }

    public static void main(String[] args) {
        _400 test = new _400();
        System.out.println(test.findNthDigit(99));
//        System.out.println("147".charAt(2));
    }
}
