package zhou.yi.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/12 15:09
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class _1 {
    public int[] twoSum(int[] nums, int target) {
        int[] rst = new int[2];
        Map<Integer,Integer> his = new HashMap<>();
        for (int i = 0,size = nums.length;i < size;i++){
            if(his.containsKey(target - nums[i])){
                rst[0] = his.get(target - nums[i]);
                rst[1] = i;
                return rst;
            }
            his.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args){
        _1 test = new _1();
        int[] nums = new int[]{2, 7, 11, 15};
        int[] rst = test.twoSum(nums,9);
        System.out.println(rst);
    }
}
