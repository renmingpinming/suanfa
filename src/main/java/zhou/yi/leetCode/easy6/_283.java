package zhou.yi.leetCode.easy6;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/28 8:56
 */
public class _283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int len = nums.length;
        for (int i = 0;i < len;i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index;i < len;i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        _283 test = new _283();
        int[] nums = new int[]{0,1,0,3,12};
        test.moveZeroes(nums);
        System.out.println(nums);
    }
}
