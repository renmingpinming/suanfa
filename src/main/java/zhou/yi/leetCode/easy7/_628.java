package zhou.yi.leetCode.easy7;

import java.util.Arrays;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/7 8:57
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: 6
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: 24
 * 注意:
 * <p>
 * 给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
 * 输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
 */
public class _628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (len == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        if (nums[0] < 0) {
            if (nums[1] < 0) {
                return Math.max((nums[0] * nums[1] * nums[len - 1]), (nums[len - 1] * nums[len - 2] * nums[len - 3]));
            } else {
                return nums[len - 1] * nums[len - 2] * nums[len - 3];
            }
        } else {
            return nums[len - 1] * nums[len - 2] * nums[len - 3];
        }
    }

    public int maximumProduct2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int a = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int b = nums[len - 1] * nums[0] * nums[1];
        return a < b ? b : a;
    }

    public static void main(String[] args) {
        _628 test = new _628();
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(test.maximumProduct(nums));
    }
}
