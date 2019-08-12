package zhou.yi.leetCode.easy6;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/27 8:51
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
public class _217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 1) {
            return Boolean.FALSE;
        }
        Set<Integer> exists = new HashSet<>();
        for (int num : nums) {
            if (!exists.add(num)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static void main(String[] args) {
        _217 test = new _217();
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(test.containsDuplicate(nums));
    }
}
