package zhou.er.test;

/**
 * @Author:XiaoLang
 * @Date:2019-09-25 18:11
 */
public class StringTest {
    public static void main(String[] args) {
        Integer x = 201909;
        StringBuilder sb = new StringBuilder(x.toString());
        sb.insert(4,"-");
        System.out.println(sb.toString());
    }
}
