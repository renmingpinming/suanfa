package zhou.er.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author:XiaoLang
 * @Date:2019-10-24 09:37
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> setTest = new HashSet<>();
        setTest.add("aaa");
        setTest.add("bbb");
        setTest.add("ccc");
        String xx = setTest.toString();
        xx = xx.replace(",",";");
        xx = xx.substring(1,xx.length()-1);
    }
}
