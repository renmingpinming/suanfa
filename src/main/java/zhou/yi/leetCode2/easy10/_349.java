package zhou.yi.leetCode2.easy10;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/21 18:18
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
public class _349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> numsSet1 = new HashSet<>();
        Set<Integer> numsSet2 = new HashSet<>();
        for (int n:nums1) {
            numsSet1.add(n);
        }
        for (int n:nums2) {
            if(numsSet1.contains(n)){
                numsSet2.add(n);
            }
        }
        int[] rst = new int[numsSet2.size()];
        int i = 0;
        int[] result = new int[numsSet2.size()];
        for (int num: numsSet2) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        _349 test = new _349();
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        System.out.println(test.intersection(nums1,nums2));
    }
}
