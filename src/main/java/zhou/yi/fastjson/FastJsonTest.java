package zhou.yi.fastjson;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Date;

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
        System.out.println(model);
    }
}
