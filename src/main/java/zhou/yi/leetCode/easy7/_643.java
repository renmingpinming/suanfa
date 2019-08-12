package zhou.yi.leetCode.easy7;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/7 18:20
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,12,-5,-6,50,3], k = 4
 * 输出: 12.75
 * 解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 * <p>
 * <p>
 * 注意:
 * <p>
 * 1 <= k <= n <= 30,000。
 * 所给数据范围 [-10,000，10,000]。
 */
public class _643 {
    public double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum * 1.0 / k;
    }

    public static void main(String[] args) {
        _643 test = new _643();
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(test.findMaxAverage(nums, k));
    }
}
