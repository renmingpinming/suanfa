package zhou.yi.test3;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/18 15:20
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","b");
        map.put("c","d");
        System.out.println(map.get("d"));

        System.out.println(map.getOrDefault("d","hello"));
    }
}
