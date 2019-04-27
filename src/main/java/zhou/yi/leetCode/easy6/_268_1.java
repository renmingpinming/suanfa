package zhou.yi.leetCode.easy6;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/27 10:40
 */
public class _268_1 {
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i] ^ i;
        }
        return result;
    }
}
