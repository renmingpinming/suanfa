package zhou.yi.leetCode.easy2;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/18 10:15
 */
public class _58 {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        int len = strs.length;
        if (len == 0) {
            return 0;
        }
        return strs[len - 1].length();
    }

    public static void main(String[] args) {
        _58 test = new _58();
//        String s = "Hello World";
        String s = "a";
        System.out.println(test.lengthOfLastWord(s));
    }
}
