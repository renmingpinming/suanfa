package zhou.yi.leetCode.easy6;

import java.util.Arrays;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/27 9:50
 */
public class _268 {
    public int missingNumber(int[] nums) {
        if(nums == null || nums.length ==0){
            return 0;
        }
        if(nums.length == 1){
            if(nums[0] == 0){
                return nums[0]+1;
            }else {
                return nums[0]-1;
            }
        }
        Arrays.sort(nums);
        if(nums[0] != 0){
            return 0;
        }
        for (int i = 1,len = nums.length;i < len;i++){
            if(nums[i] - nums[i - 1] != 1){
                return nums[i] - 1;
            }
        }
        return nums[nums.length -1]+1;
    }

    public static void main(String[] args) {
        _268 test = new _268();
        int[] nums = new int[]{0,1};
        System.out.println(test.missingNumber(nums));
    }
}
