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
public class ObjToMap {
//    public static Map<String, Object> objectToMap(Object obj) throws Exception {
//        if(obj == null){
//            return null;
//        }
//
//        Map<String, Object> map = new HashMap<String, Object>();
//
//        Field[] declaredFields = obj.getClass().getDeclaredFields();
//        for (Field field : declaredFields) {
//            field.setAccessible(true);
//            map.put(field.getName(), field.get(obj));
//            String s = field.getName();
//            Object value =field.get(obj);
//            if(value!= null){
//                System.out.println(value.getClass());
//                if(field.getType().isAssignableFrom(List.class)){
//                    System.out.println("为list类型");
////                    for (Object v:(ArrayList)value) {
////                        System.out.println("v:"+v.getClass());
////                        if(v.getClass().isPrimitive()){
////                            System.out.println("为基本类型");
////                        }
////                    }
//                    System.out.println(field.getGenericType());
//                }
//            }
//        }
//
//        return map;
//    }

    public static Map<String, Object> objectToMap2(Object obj) throws Exception {
        if(obj == null)
            return null;

        Map<String, Object> map = new HashMap<String, Object>();

        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor property : propertyDescriptors) {
            String key = property.getName();
            if (key.compareToIgnoreCase("class") == 0) {
                continue;
            }
            Method getter = property.getReadMethod();
            Object value = getter!=null ? getter.invoke(obj) : null;
            map.put(key, value);
            if(value!= null){
                System.out.println(value.getClass());
                if(value.getClass().isAssignableFrom(List.class)){
                    System.out.println("为list类型");
                }
            }
        }

        return map;
    }

    public static void main(String[] args) {
        Model model = new Model();
        model.setNum(1);
        model.setProditemId(2);
//        model.setCompprodId(3);
        List<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(100);
        list.add(101);
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        model.setList(list);
        model.setList2(list2);
        List<Model> models = new ArrayList<>();
        Model model2 = new Model();
        model2.setNum(4);
        Model model3 = new Model();
        model3.setProditemId(5);
        models.add(model2);
        models.add(model3);
        model.setModels(models);
        Map<String, Object> modelMap = null;
        try {
            modelMap = objectToMap2(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        for (Map.Entry entry: modelMap.entrySet()) {
//            System.out.println("key:"+entry.getKey());
//            System.out.println("value:"+entry.getValue());
//        }
        System.out.println();
    }
}
