package zhou.er.test;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:XiaoLang
 * @Date:2019-09-18 11:22
 */
public class JsonTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("zhou","yi");
        String str = JSON.toJSONString(map);
        System.out.println(str);

        Map<String,String> map2= JSON.parseObject(str,Map.class);
        System.out.println(map2);
    }
}
