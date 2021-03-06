package zhou.yi.leetCode.easy7;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/5 18:03
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 */
public class _485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxCount = 0;
        int nowCount = 0;
        for (int num : nums) {
            if (num == 0) {
                maxCount = Math.max(maxCount, nowCount);
                nowCount = 0;
            } else {
                nowCount++;
            }
        }
        return Math.max(maxCount, nowCount);
    }

    public static void main(String[] args) {
        _485 test = new _485();
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        System.out.println(test.findMaxConsecutiveOnes(nums));
    }
}
