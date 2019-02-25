package zhou.yi.test;

import java.math.BigDecimal;

/**
 * @Author: XiaoLang
 * @Date: 2019/1/17 16:09
 */
public class subTest {
    public static void main(String[] args)throws Exception{
        String rst = "'a','b','c','d','";
        System.out.println(rst.substring(0,rst.length()-2));
        Integer a = 2014;
        Integer b = 26587;
        System.out.println(new BigDecimal(a).divide(new BigDecimal(b),4,BigDecimal.ROUND_HALF_UP));
        Double c = 19220.66220685789;
        Integer d = Math.toIntExact(Math.round(c));
        System.out.println(d);
    }
}
