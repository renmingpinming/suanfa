package zhou.yi.leetCode2.medium2;

import java.util.Arrays;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/9 14:19
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * <p>
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * <p>
 * 必须原地修改，只允许使用额外常数空间。
 * <p>
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */
public class _31 {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int i = nums.length - 2;
        while (i > 0) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
            i--;
        }
        int j = nums.length - 1;
        while (j > i) {
            if (nums[j] > nums[i]) {
                break;
            }
            j--;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        if (i == j) {
            Arrays.sort(nums, i, nums.length);
        } else {
            Arrays.sort(nums, i + 1, nums.length);
        }
    }

    public static void main(String[] args) {
        _31 test = new _31();
        int[] x = new int[]{3, 2, 1};
        test.nextPermutation(x);
        System.out.println();
    }
}
