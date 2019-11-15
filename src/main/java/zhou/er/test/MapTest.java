package zhou.er.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:XiaoLang
 * @Date:2019-11-13 14:21
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","b");
        map.put("c","d");
        map.put("e","f");
        System.out.println(map.get("f"));
    }
}
