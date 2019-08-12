package zhou.yi.leetCode.easy2;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/18 10:32
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class _66 {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            carry = 0;
            if (digits[i] + 1 == 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = digits[i] + 1;
            }
            if (carry == 0) {
                break;
            }
        }
        int[] temp = new int[len + 1];
        if (carry == 1) {
            temp[0] = 1;
            for (int i = 0; i < len; i++) {
                temp[i + 1] = digits[i];
            }
            return temp;
        }
        return digits;
    }

    public static void main(String[] args) {
        _66 test = new _66();
        int[] nums = new int[]{9};
        System.out.println(test.plusOne(nums));
    }
}
