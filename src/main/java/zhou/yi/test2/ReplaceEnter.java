package zhou.yi.test2;

import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/6/20 10:03
 */
public class ReplaceEnter {
    public static void main(String[] args) {
        String s = "\n1235 44,\n154  89";
//        System.out.println(s.replace("\n",""));
//        System.out.println(s.replace(" ",""));
        String[] x = s.replace("\n","").replace(" ","").split(",");
        System.out.println(x);
    }
}
