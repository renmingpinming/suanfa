package zhou.yi.leetCode2.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/6/24 17:11
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class _15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rst = new ArrayList<>();
        if (nums.length < 3) {
            return rst;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            int l = i + 1, r = nums.length - 1;
            while (r > l) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    rst.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (sum > 0) {
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    r--;
                } else {
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    l++;
                }
            }
        }
        return rst;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> rst = new ArrayList<>();
        if (nums.length < 3) {
            return rst;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            int l = i + 1, r = nums.length - 1;
            while (r > l) {
                if (nums[i] > -nums[l] - nums[r]) {
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    r--;
                } else if (nums[i] < -nums[l] - nums[r]) {
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    l++;
                } else {
                    rst.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        _15 test = new _15();
        System.out.println(test.threeSum2(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
