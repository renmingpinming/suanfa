package zhou.yi.leetCode.easy7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/29 17:44
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * <p>
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * <p>
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * 输出:
 * [5,6]
 */
public class _448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        final List<Integer> resultList = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return resultList;
        }
        for (int i = 0; i < nums.length; i++) {
            int desiredIndex = nums[i] - 1;
            if (nums[desiredIndex] != nums[i]) {
                int temp = nums[desiredIndex];
                nums[desiredIndex] = nums[i];
                nums[i] = temp;
                i--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                resultList.add(i + 1);
            }
        }
        return resultList;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        final List<Integer> list = new ArrayList<>();
        if (nums == null) {
            return list;
        }
        // switch
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                list.add(temp);
            }
        }
        // fill the rest
        while (list.size() != 0) {
            nums[list.get(0) - 1] = list.get(0);
            list.remove(0);
        }

        // validate
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        _448 test = new _448();
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(test.findDisappearedNumbers(nums));
    }
}
