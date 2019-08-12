package zhou.yi.leetCode2.medium2;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/10 10:00
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * <p>
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * <p>
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * <p>
 * 你可以假设数组中不存在重复的元素。
 * <p>
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [4,5,6,7,0,1,2], target = 0
 * 输出: 4
 * 示例 2:
 * <p>
 * 输入: nums = [4,5,6,7,0,1,2], target = 3
 * 输出: -1
 * 二分查找
 */
public class _33 {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        //二分查找旋转点
        while (i < j) {
            int m = i + ((j - i) >> 1);
            if (nums[m] > nums[j]) {
                i = m + 1;
            } else {
                j = m;
            }
        }
        //判断目标在二分的左边还是右边
        if (i == 0 || target >= nums[i] && target <= nums[nums.length - 1]) {
            j = nums.length - 1;
        } else if (target >= nums[0] && target <= nums[i - 1]) {
            j = i - 1;
            i = 0;
        } else {
            return -1;
        }
        //二分查找目标值
        while (i <= j) {
            int m = i + ((j - i) >> 1);
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _33 test = new _33();
        int[] nums = new int[]{3, 1};
        System.out.println(test.search(nums, 3));
    }
}
