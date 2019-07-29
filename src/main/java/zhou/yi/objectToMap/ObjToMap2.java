package zhou.yi.objectToMap;

import zhou.yi.fastjson.Model;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/29 9:43
 */
public class ObjToMap2 {
    public static List<Map<String, Object>> objectToMap(Object obj) throws Exception {
        if(obj == null){
            return null;
        }

        List<Map<String, Object>> rst = new ArrayList<>();

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
//            map.put(field.getName(), field.get(obj));
            String s = field.getName();
            Object value =field.get(obj);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("key",s);
            map.put("value",value);
            if(value!= null){
                System.out.println(value.getClass());
                if(field.getType().isAssignableFrom(List.class)){
                    System.out.println("为list类型");
//                    for (Object v:(ArrayList)value) {
//                        System.out.println("v:"+v.getClass());
//                        if(v.getClass().isPrimitive()){
//                            System.out.println("为基本类型");
//                        }
//                    }
                    System.out.println(field.getGenericType());
                }
            }
            rst.add(map);
        }

        return rst;
    }

    public static void main(String[] args) {
        Zhou zhou = new Zhou();
        List<Yi> yis = new ArrayList<>();
        Yi yi1 = new Yi();
        Yi yi2 = new Yi();
        yi1.setNum(1);
        yi1.setSex("man");
        yi2.setNum(2);
        yis.add(yi1);
        yis.add(yi2);
        zhou.setYis(yis);
        List<Map<String, Object>> modelMap = null;
        try {
            modelMap = objectToMap(zhou);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(modelMap);
    }
}
