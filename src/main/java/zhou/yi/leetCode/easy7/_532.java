package zhou.yi.leetCode.easy7;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/5 18:40
 */
public class _532 {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 0){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:nums) {
            map.putIfAbsent(num,0);
            map.put(num,map.get(num) + 1);
        }
        int count = 0;
        for (int key: map.keySet()) {
            if(k == 0){
                if(map.get(key) > 1){
                    count++;
                }
            }else if(map.containsKey(key + k)){
                    count++;
                }
        }
        return count;
    }

    public static void main(String[] args) {
        _532 test = new _532();
        int[] nums = new int[]{1,2,3,4,5};
        int k = -1;
        System.out.println(test.findPairs(nums,k));
    }
}
