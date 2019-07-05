package zhou.yi.leetCode2.medium2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/3 14:44
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * 例如，给出 n = 3，生成结果为：
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */
public class _22 {
    public List<String> generateParenthesis(int n) {
        List<String> rst = new ArrayList<>();
        String ans = "";
        help(rst,ans,0,0,n);
        return rst;
    }

    public void help(List<String> rst,String ans,Integer left,Integer right,Integer max){
        if(ans.length() == max * 2){
            rst.add(ans);
            return;
        }
        if(left < max){
            help(rst,ans+"(",left + 1,right,max);
        }
        if(right < left){
            help(rst,ans+")",left,right + 1,max);
        }
    }

    public static void main(String[] args) {
        _22 test = new _22();
        System.out.println(test.generateParenthesis(3));
    }
}
