package zhou.er.test;

import java.util.Random;

/**
 * @Author:XiaoLang
 * @Date:2019-11-15 09:46
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        Integer x =random.nextInt(10000);
        System.out.println(x);
        String xx = "https://aftersale.ewszjk.m.jaeapp.com/#/?shopId=26&tid=&categoryId=&random=";
        xx+=x;
        xx+=x;
        System.out.println(xx);
        for(int i = 0;i < 10;i++){
            Random random1 = new Random();
            Integer x1 =random1.nextInt(10000);
        }
        String url = "https://aftersale.ewszjk.m.jaeapp.com/#/?shopId=26&random=&tid=&categoryId=";
    }
}
