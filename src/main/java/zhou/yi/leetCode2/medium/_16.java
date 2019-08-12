package zhou.yi.leetCode2.medium;

import java.util.Arrays;

/**
 * @Author: XiaoLang
 * @Date: 2019/6/25 10:32
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * <p>
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * <p>
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class _16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int rst = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (r > l) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < Math.abs(rst - target)) {
                    rst = sum;
                }
                if (sum - target > 0) {
                    r--;
                } else if (sum - target < 0) {
                    l++;
                } else {
                    return rst;
                }
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        _16 test = new _16();
        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;
        System.out.println(test.threeSumClosest(nums, target));
    }
}
