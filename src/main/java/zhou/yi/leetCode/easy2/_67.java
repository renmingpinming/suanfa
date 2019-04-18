package zhou.yi.leetCode.easy2;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/18 15:15
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 */
public class _67 {
    public String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int max = lenA > lenB ? lenA : lenB;
        StringBuilder rst = new StringBuilder();
        int carry = 0;
        for(int i = 1;i<= max;i++){
            int numA;
            int numB;
            if(lenA - i >= 0){
                numA = Character.getNumericValue(a.charAt(lenA - i)) ;
            }else {
                numA = 0;
            }
            if(lenB - i >= 0){
                numB = Character.getNumericValue(b.charAt(lenB - i)) ;
            }else {
                numB = 0;
            }
            int num = numA+numB+carry;
            rst.insert(0,num%2);
            carry = num / 2;
        }
        if(carry == 1){
            rst.insert(0,carry);
        }
        return rst.toString();
    }

    public static void main(String[] args) {
        _67 test = new _67();
        String a = "1010";
        String b = "1011";
        System.out.println(test.addBinary(a,b));
    }
}
