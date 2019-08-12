package zhou.yi.leetCode.easy4;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/23 14:22
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */
public class _169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 1);
            } else {
                countMap.put(num, countMap.get(num) + 1);
            }
        }
        int majorityCount = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > majorityCount) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        _169 test = new _169();
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(test.majorityElement(nums));
    }
}
