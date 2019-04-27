package zhou.yi.leetCode.easy6;

import java.util.Arrays;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/27 8:59
 * #### Sort, Binary Search
 * - Arrays.sort(x): Time O(nLogN), Space O(1)
 * - 排序后, 重复数会排在一起, 然后 binary search
 */
public class _217_1 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
