package zhou.yi.leetCode.easy2;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/17 17:38
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */
public class _35 {
    public int searchInsert(int[] nums, int target) {
        int insert = 0;
        for(int i = 0,len = nums.length;i < len;i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] > target){
                if(i == 0){
                    insert = 0;
                }else if (nums[i - 1] < target){
                    insert = i;
                }
            }else {
                insert = len;
            }
        }
        return insert;
    }

    public static void main(String[] args) {
        _35 test = new _35();
        int[] nums = new int[]{1,3,5,6};
        int target = 7;
        System.out.println(test.searchInsert(nums,target));
    }
}
