package zhou.yi.leetCode.easy4;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/23 11:12
 */
public class _167_1 {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return null;
        }

        int[] res = new int[2];

        int l = 0, r = numbers.length - 1;

        while (l < r) {
            int left = numbers[l];
            int right = numbers[r];

            if (target < (left + right)) {
                r--;
            } else if (target > (left + right)) {
                l++;
            } else {
                res[0] = l + 1;
                res[1] = r + 1;
                break;
            }
        }
        return res;
    }
}
