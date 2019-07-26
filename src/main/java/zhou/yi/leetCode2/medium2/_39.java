package zhou.yi.leetCode2.medium2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/26 9:46
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 *
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 *
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * 示例 2:
 *
 * 输入: candidates = [2,3,5], target = 8,
 * 所求解集为:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 */
public class _39 {
    List<List<Integer>> rst = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length == 0){
            return rst;
        }
        cal(candidates,target,0,new Stack<>());
        return rst;
    }

    public void cal(int[] candidates,int residue, int start, Stack<Integer> pre){
        if(residue < 0){
            return;
        }
        if(residue == 0){
            rst.add(new ArrayList<>(pre));
            return;
        }
        for (int i = start;i < candidates.length;i++){
            pre.push(candidates[i]);
            cal(candidates,residue - candidates[i],i,pre);
            pre.pop();
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        _39 solution = new _39();
        List<List<Integer>> combinationSum = solution.combinationSum(candidates, target);
        System.out.println(combinationSum);
    }
}
