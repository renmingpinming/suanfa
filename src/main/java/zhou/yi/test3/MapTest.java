package zhou.yi.test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/18 15:20
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("c", "d");
        System.out.println(map.get("d"));

        System.out.println(map.getOrDefault("d", "hello"));

        Map<String, Object> map1 = new HashMap<>();
        List<String> names = new ArrayList<>();
        names.add("ab");
        names.add("cd");
        map1.put("test", names);
        System.out.println(map1);

        map1.put("xx", null);
        map1.put("yy", null);
        System.out.println();
    }
}
