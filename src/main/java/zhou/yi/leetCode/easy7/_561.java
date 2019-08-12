package zhou.yi.leetCode.easy7;

import java.util.Arrays;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/6 8:46
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,4,3,2]
 * <p>
 * 输出: 4
 * 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 */
public class _561 {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int rst = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            rst += nums[i];
        }
        return rst;
    }

    public static void main(String[] args) {
        _561 test = new _561();
        int[] nums = new int[]{1, 4, 3, 2};
        System.out.println(test.arrayPairSum(nums));
    }
}
