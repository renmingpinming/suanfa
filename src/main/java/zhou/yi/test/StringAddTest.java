package zhou.yi.test;

/**
 * @Author: XiaoLang
 * @Date: 2019/3/1 13:36
 */
public class StringAddTest {
    public static void main(String[] args) {
        String s1 = "good";
        String s2 = "day";
        String s3 = s1 + s2;
        String s4 = "goodday";
        System.out.println(s4 == s3);
        System.out.println(s4 == s3.intern());

        int i = 12;
        System.out.println(i += i -= i *= i);
    }
}
