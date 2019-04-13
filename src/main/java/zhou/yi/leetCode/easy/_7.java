package zhou.yi.leetCode.easy;

import java.math.BigInteger;
import java.util.Stack;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/13 10:59
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 */
public class _7 {
    public int reverse(int x) {
        Stack<Integer> numStack = new Stack<>();
        while (x / 10 != 0){
            numStack.push(x % 10);
            x /= 10;
        }
        numStack.push(x % 10);
        String str = "";
        for (Integer num:numStack) {
            str+=Math.abs(num);
        }
        int abs =0;
        try {
            abs = Integer.valueOf(str);
        } catch (NumberFormatException e) {

        }
        if(x < 0){
            abs*=-1;
        }
        return abs;
    }

    public static void main(String[] args){
        int num = 1534236469;
        _7  test = new _7();
        int n = test.reverse(num);
        System.out.println(n);
    }
}
