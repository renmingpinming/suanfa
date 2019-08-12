package zhou.yi.leetCode.easy4;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/22 17:14
 * 异或
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class _136 {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int rst = nums[0];
        for (int i = 1, len = nums.length; i < len; i++) {
            //异或
            rst = rst ^ nums[i];
        }
        return rst;
    }

    public static void main(String[] args) {
        _136 test = new _136();
        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(test.singleNumber(nums));
    }
}
