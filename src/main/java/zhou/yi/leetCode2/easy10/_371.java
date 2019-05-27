package zhou.yi.leetCode2.easy10;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/27 16:47
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 *
 * 示例 1:
 *
 * 输入: a = 1, b = 2
 * 输出: 3
 * 示例 2:
 *
 * 输入: a = -2, b = 3
 * 输出: 1
 */
public class _371 {
    public int getSum(int a, int b) {
        //异或，把不同的相加，得到和
        int sum = a ^ b;
        //与，把同为1的找出，向左移一位，得到进位
        int carry = (a & b )<< 1;
        if(carry == 0){
            return sum;
        }
        return getSum(sum,carry);
    }

    public static void main(String[] args) {
        _371 test = new _371();
        System.out.println(test.getSum(-2,3));
    }
}
