package zhou.yi.leetCode.easy5;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/23 16:26
 */
public class _189_1 {
    /**
     * 翻转
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }


    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
