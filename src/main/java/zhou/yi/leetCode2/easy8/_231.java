package zhou.yi.leetCode2.easy8;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/13 17:51
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: true
 * 解释: 20 = 1
 * 示例 2:
 *
 * 输入: 16
 * 输出: true
 * 解释: 24 = 16
 * 示例 3:
 *
 * 输入: 218
 * 输出: false
 */
public class _231 {
    public boolean isPowerOfTwo(int n) {
        while (n > 0){
            if(n == 1){
                return Boolean.TRUE;
            }
            if(n % 2 != 0){
                return Boolean.FALSE;
            }
            n=n>>1;
        }
        return Boolean.FALSE;
    }

    public static void main(String[] args) {
        _231 test = new _231();
        System.out.println(test.isPowerOfTwo(218));
    }
}
