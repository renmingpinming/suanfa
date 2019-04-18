package zhou.yi.leetCode.easy2;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/18 9:50
 */
public class _53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = maxSum;
        int len = nums.length;
        for (int i = 1;i < len;i++){
            if(sum > 0){
                sum += nums[i];
            }else {
                sum = nums[i];
            }
            if(sum > maxSum){
                maxSum  = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        _53 test = new _53();
//        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = new int[]{1};
        System.out.println(test.maxSubArray(nums));
    }
}
