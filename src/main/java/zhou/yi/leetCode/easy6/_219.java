package zhou.yi.leetCode.easy6;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/27 9:32
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 *
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 *
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 */
public class _219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length <= 1 || k < 0){
            return Boolean.FALSE;
        }
        Map<Integer,Integer> exists = new HashMap<>();
        for(int i = 0,len = nums.length;i < len;i++){
            if(exists.containsKey(nums[i])){
                if(i - exists.get(nums[i]) <= k){
                    return Boolean.TRUE;
                }
            }
            exists.put(nums[i],i);
        }
        return Boolean.FALSE;
    }

    public static void main(String[] args) {
        _219 test = new _219();
        int[] nums = new int[]{1,2,3,1,2,3};
        int k = 2;
        System.out.println(test.containsNearbyDuplicate(nums,k));
    }
}
