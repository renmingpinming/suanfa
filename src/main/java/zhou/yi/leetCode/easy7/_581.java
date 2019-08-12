package zhou.yi.leetCode.easy7;

import java.util.Arrays;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/6 18:16
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * <p>
 * 你找到的子数组应是最短的，请输出它的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 */
public class _581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedArr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArr);
        int i = 0, j = nums.length - 1;
        while (nums[i] == sortedArr[i] && i < j)
            i++;
        while (nums[j] == sortedArr[j] && i < j)
            j--;
        if (i == j)
            return 0;
        else
            return j - i + 1;
    }

    public int findUnsortedSubarray2(int[] nums) {
        int length = nums.length;
        int low = length - 1;
        int high = 0;
        int max = nums[0];
        int min = nums[length - 1];
        for (int i = 0; i < length; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[length - i - 1], min);
            if (nums[i] < max) {
                high = i;
            }
            if (nums[length - i - 1] > min) {
                low = length - i - 1;
            }
        }
        if (low >= high) {
            return 0;
        }
        return high - low + 1;
    }

    public static void main(String[] args) {
        _581 test = new _581();
        int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        System.out.println(test.findUnsortedSubarray2(nums));
    }
}
