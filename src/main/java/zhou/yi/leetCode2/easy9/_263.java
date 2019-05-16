package zhou.yi.leetCode2.easy9;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/16 11:18
 * 编写一个程序判断给定的数是否为丑数。
 *
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 *
 * 示例 1:
 *
 * 输入: 6
 * 输出: true
 * 解释: 6 = 2 × 3
 * 示例 2:
 *
 * 输入: 8
 * 输出: true
 * 解释: 8 = 2 × 2 × 2
 * 示例 3:
 *
 * 输入: 14
 * 输出: false
 * 解释: 14 不是丑数，因为它包含了另外一个质因数 7。
 */
public class _263 {
    public boolean isUgly(int num) {
        if(num <= 0){
            return Boolean.FALSE;
        }
        if(num == 1){
            return Boolean.TRUE;
        }
        if(num % 2 != 0 && num % 3 != 0 && num % 5 != 0){
            return Boolean.FALSE;
        }
        if(num % 2 == 0){
            return isUgly(num / 2);
        }
        if(num % 3 == 0){
            return isUgly(num / 3);
        }
        if(num % 5 == 0){
            return isUgly(num / 5);
        }
        return Boolean.FALSE;
    }

    public static void main(String[] args) {
        _263 test = new _263();
        System.out.println(test.isUgly(6));
    }
}
