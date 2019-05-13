package zhou.yi.fastjson;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/30 14:07
 */
public class FastJsonTest {

    public static void main(String[] args) {
        String str = "{\n" +
                "  \"compprod_id\": \"12530\",\n" +
                "  \"proditem_id\": \"3662\",\n" +
                "  \"num\": \"1\",\n" +
                "  \"gmt_create\": \"2017/10/12 22:00:53\",\n" +
                "  \"gmt_modify\": \"2017/10/12 22:00:53\"\n" +
                "}";
        Model model = JSON.parseObject(str,Model.class);
//        System.out.println(model);

        Model test = new Model();
        Model test2 = new Model();
        test.setNum(1);
        test.setCompprodId(1);
        test.setProditemId(1);
        test2.setNum(1);
        test2.setCompprodId(1);
        test2.setProditemId(1);
        List<Model> list = new ArrayList<>();
        list.add(test);
        list.add(test2);
        String listToString = JSON.toJSONString(list);
        System.out.println(listToString);

        List<Model> stringToList = JSON.parseArray(listToString,Model.class);
        System.out.println(stringToList);
    }
}
