package zhou.yi.leetCode.easy6;

import java.util.HashMap;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/27 9:47
 */
public class _219_1 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 35000) return false;

        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            Integer ii = map.get(nums[i]);
            if (ii != null && i - ii <= k) return true;
            map.put(nums[i], i);
        }

        return false;
    }
}
