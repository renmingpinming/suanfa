package zhou.yi.leetCode.easy6;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/29 8:58
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 *
 * 示例 1:
 *
 * 输入: [3, 2, 1]
 *
 * 输出: 1
 *
 * 解释: 第三大的数是 1.
 * 示例 2:
 *
 * 输入: [1, 2]
 *
 * 输出: 2
 *
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 *
 * 输入: [2, 2, 3, 1]
 *
 * 输出: 1
 *
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 */
public class _414 {
 public int thirdMax(int[] nums) {
     long minVal = (long)Integer.MIN_VALUE - 1;
     long maxFirst = minVal, maxSecond = minVal, maxThird = minVal;
     for(int num : nums){
         if(num > maxFirst){
             maxThird = maxSecond;
             maxSecond = maxFirst;
             maxFirst = num;
         }else if(num < maxFirst && num > maxSecond){
             maxThird = maxSecond;
             maxSecond = num;
         }else if(num < maxSecond && num > maxThird){
             maxThird = num;
         }
     }
     return (int) (maxThird == minVal ? maxFirst : maxThird);
    }

    public static void main(String[] args) {
        _414 test = new _414();
        int[] nums = new int[]{5,2,2,5,8,9,6,4};
        System.out.println(test.thirdMax(nums));
    }
}
