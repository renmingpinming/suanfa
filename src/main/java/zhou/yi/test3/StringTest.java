package zhou.yi.test3;

import java.util.Date;

/**
 * @Author:XiaoLang
 * @Date:2019-08-12 16:47
 */
public class StringTest {
    public static void main(String[] args) {
        char[] s = {'a','b'};
        String str = String.valueOf(s);
        System.out.println(str);

        String s1 = "1565753726";
        s1 = s1+"000";
        Date date = new Date(Long.parseLong(s1));
        System.out.println();

        String x = Boolean.TRUE?"yes":"no";
        System.out.println(x);
    }
}
