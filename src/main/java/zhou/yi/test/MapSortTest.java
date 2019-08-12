package zhou.yi.test;

import java.util.*;

public class MapSortTest {
    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new TreeMap<String, Object>();
        map.put("start_time", "start_time");
        map.put("end_time", "end_time");
        map.put("cycle", "cycle");
        map.put("data_type_code", "data_type_code");
        map.put("店铺名称", "店铺名称");
        map.put("商品id", "商品id");
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println(key + ":" + map.get(key));
        }
        String x = map.toString();
        System.out.println(x);
    }
}
