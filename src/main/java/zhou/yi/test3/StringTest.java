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
        String pname= "png;base64";
        pname = pname.replace(";base64","");
        System.out.println(pname);

        String s2 = "1.23142E+11";
        if(s2.contains("E")){
            System.out.println("包含E");
        }
    }
}
