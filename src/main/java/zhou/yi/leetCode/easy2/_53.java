package zhou.yi.leetCode.easy2;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/18 9:50
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class _53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = maxSum;
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        _53 test = new _53();
//        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = new int[]{1};
        System.out.println(test.maxSubArray(nums));
    }
}
