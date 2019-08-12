package zhou.yi.leetCode2.medium2;

import java.util.*;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/1 18:26
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * <p>
 * 注意：
 * <p>
 * 答案中不可以包含重复的四元组。
 * <p>
 * 示例：
 * <p>
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 * <p>
 * 满足要求的四元组集合为：
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 */
public class _18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Set<List<Integer>> map = new HashSet<>(lists);
        if (nums.length < 4) {
            return lists;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int l = j + 1;
                int r = nums.length - 1;
                while (r > l) {
                    if (nums[i] > target - nums[j] - nums[l] - nums[r]) {
                        r--;
                    } else if (nums[i] < target - nums[j] - nums[l] - nums[r]) {
                        l++;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        map.add(list); // 用哈希表去重,将匹配的四数集合放入 map
                        l++;
                        r--;
                        continue; // 继续查找下一可能组合
                    }
                }
            }
        }
        lists.addAll(map); // 将所有非重复结果加入 lists
        return lists;
    }

    public static void main(String[] args) {
        _18 test = new _18();
        System.out.println(test.fourSum(new int[]{0, 0, 0, 0}, 1));
    }
}
