package zhou.yi.leetCode2.medium2;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/11 9:43
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 如果数组中不存在目标值，返回 [-1, -1]。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 */
public class _34 {
    public int[] searchRange(int[] nums, int target) {
        int[] rst = new int[]{-1, -1};
        int left = erfenL(nums, target, true);
        if (left < 0) {
            return rst;
        }
        int right = erfenL(nums, target, false);
        rst[0] = left;
        rst[1] = right;
        return rst;
    }

    public int erfenL(int[] nums, int target, Boolean ifLeft) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + ((r - l) >> 1);
            if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                if (ifLeft) {
                    if (m == 0 || nums[m] != nums[m - 1]) {
                        return m;
                    } else {
                        r = m - 1;
                    }
                } else {
                    if (m == nums.length - 1 || nums[m] != nums[m + 1]) {
                        return m;
                    } else {
                        l = m + 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _34 test = new _34();
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        nums = test.searchRange(nums, 8);
        System.out.println();
    }
}
