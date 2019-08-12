package zhou.yi.test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.deploy.util.StringUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JsonTest {
    private static ObjectMapper MAPPER = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        HashMap<String, Object> mmap = MAPPER.readValue(str, HashMap.class);
        HashMap<String, HashMap<String, Object>> mmap2 = MAPPER.readValue(str, HashMap.class);
//        System.out.println(mmap2.get("buyerCnt"));
//        System.out.println(mmap2.get("itemModel").get("title"));
        ArrayList<HashMap<String, HashMap<String, HashMap<String, Object>>>> sList2 = MAPPER.readValue(strs, ArrayList.class);
//        for (HashMap<String,HashMap<String,HashMap<String,Object>>> s: sList2) {
//            System.out.println(s.get("itemModel").get("title"));
//            System.out.println(s.get("buyerCnt"));
//        }
        HashMap<String, String> item = MAPPER.readValue(str3, HashMap.class);
        Map<String, String> item2 = MAPPER.readValue(str3, Map.class);
        for (HashMap<String, HashMap<String, HashMap<String, Object>>> s : sList2) {
            for (String key : item.keySet()) {
//                if(item.get(key)==null || "".equals(item.get(key))){
//                    System.out.println(key);
//                    System.out.println(s.get(key));
//                }else {
//                    System.out.println(key+"-"+item.get(key));
//                    System.out.println(s.get(key).get(item.get(key)));
//                }
            }
            s.get("uv");
            System.out.println("---------------------------------");
        }
        JsonNode paramNode = null;
        try {
            paramNode = MAPPER.readTree(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        String name = paramNode.get("buyerCnt2").asText();
        String name2 = paramNode.get("buyerCnt").asText();
        System.out.println("---------------------------------");
    }

    private static String str = "{\n" +
            "          \"buyerCnt\": 600,\n" +
            "          \"addCartItemCnt\": 1942,\n" +
            "          \"itemFavCnt\": 436,\n" +
            "          \"uv\": 16191,\n" +
            "          \"itemModel\": {\n" +
            "            \"title\": \"百雀羚草本水嫩倍现护肤套装女补水保湿控油化妆品套装 水乳 霜\",\n" +
            "            \"online\": true,\n" +
            "            \"pictUrl\": \"//img.alicdn.com/bao/uploaded/i3/519286239/O1CN017FxK5h1vxVXe4hW1a_!!0-item_pic.jpg\",\n" +
            "            \"starts\": 1521087566000,\n" +
            "            \"quantity\": 5739,\n" +
            "            \"itemId\": 8095482851,\n" +
            "            \"discountPrice\": 0.0,\n" +
            "            \"reservePrice\": 36600.00,\n" +
            "            \"itemDetailUrl\": \"//detail.tmall.com/item.htm?id=8095482851\",\n" +
            "            \"itemPicUrl\": \"//img.alicdn.com/bao/uploaded/i3/519286239/O1CN017FxK5h1vxVXe4hW1a_!!0-item_pic.jpg\",\n" +
            "            \"startsStr\": \"2018-03-15 12:19:26\",\n" +
            "            \"mallItem\": true\n" +
            "          },\n" +
            "          \"payAmt\": 11968299,\n" +
            "          \"payItemQty\": 643,\n" +
            "          \"auctionId\": 8095482851,\n" +
            "          \"pv\": 43974,\n" +
            "          \"indexValue\": 0,\n" +
            "          \"payRate\": 3.71,\n" +
            "          \"gmv\": 11968299\n" +
            "        }";

    private static String strs = "[\n" +
            "        {\n" +
            "          \"payAmt\": 12456711,\n" +
            "          \"addCartItemCnt\": 2061,\n" +
            "          \"itemFavCnt\": 458,\n" +
            "          \"auctionId\": 8095482851,\n" +
            "          \"indexValue\": 0,\n" +
            "          \"uv\": 17024,\n" +
            "          \"pv\": 46453,\n" +
            "          \"payRate\": 3.67,\n" +
            "          \"itemModel\": {\n" +
            "            \"title\": \"百雀羚草本水嫩倍现护肤套装女补水保湿控油化妆品套装 水乳 霜\",\n" +
            "            \"quantity\": 5711,\n" +
            "            \"online\": true,\n" +
            "            \"itemId\": 8095482851,\n" +
            "            \"discountPrice\": 0.0,\n" +
            "            \"itemDetailUrl\": \"//detail.tmall.com/item.htm?id=8095482851\",\n" +
            "            \"pictUrl\": \"//img.alicdn.com/bao/uploaded/i3/519286239/O1CN017FxK5h1vxVXe4hW1a_!!0-item_pic.jpg\",\n" +
            "            \"reservePrice\": 36600.00,\n" +
            "            \"mallItem\": true,\n" +
            "            \"startsStr\": \"2018-03-15 12:19:26\",\n" +
            "            \"itemPicUrl\": \"//img.alicdn.com/bao/uploaded/i3/519286239/O1CN017FxK5h1vxVXe4hW1a_!!0-item_pic.jpg\",\n" +
            "            \"starts\": 1521087566000\n" +
            "          },\n" +
            "          \"buyerCnt\": 625,\n" +
            "          \"payItemQty\": 669,\n" +
            "          \"gmv\": 12456711\n" +
            "        },\n" +
            "        {\n" +
            "          \"payAmt\": 5848063.0,\n" +
            "          \"addCartItemCnt\": 711,\n" +
            "          \"itemFavCnt\": 145,\n" +
            "          \"auctionId\": 530624740331,\n" +
            "          \"indexValue\": 0,\n" +
            "          \"uv\": 8299,\n" +
            "          \"pv\": 20601,\n" +
            "          \"payRate\": 1.98,\n" +
            "          \"itemModel\": {\n" +
            "            \"title\": \"百雀羚水能量焕耀护肤套装女 爽肤水乳液 补水保湿提亮化妆品套装\",\n" +
            "            \"quantity\": 19269,\n" +
            "            \"online\": true,\n" +
            "            \"itemId\": 530624740331,\n" +
            "            \"discountPrice\": 0.0,\n" +
            "            \"itemDetailUrl\": \"//detail.tmall.com/item.htm?id=530624740331\",\n" +
            "            \"pictUrl\": \"//img.alicdn.com/bao/uploaded/i4/519286239/O1CN01glPqqb1vxVXkcF8zh_!!0-item_pic.jpg\",\n" +
            "            \"reservePrice\": 53800.00,\n" +
            "            \"mallItem\": true,\n" +
            "            \"startsStr\": \"2018-12-08 09:22:21\",\n" +
            "            \"itemPicUrl\": \"//img.alicdn.com/bao/uploaded/i4/519286239/O1CN01glPqqb1vxVXkcF8zh_!!0-item_pic.jpg\",\n" +
            "            \"starts\": 1544232141000\n" +
            "          },\n" +
            "          \"buyerCnt\": 164,\n" +
            "          \"payItemQty\": 172,\n" +
            "          \"gmv\": 5848063.0\n" +
            "        },\n" +
            "        {\n" +
            "          \"payAmt\": 3078433.0,\n" +
            "          \"addCartItemCnt\": 853,\n" +
            "          \"itemFavCnt\": 183,\n" +
            "          \"auctionId\": 522099256204,\n" +
            "          \"indexValue\": 0,\n" +
            "          \"uv\": 6675,\n" +
            "          \"pv\": 15624,\n" +
            "          \"payRate\": 3.55,\n" +
            "          \"itemModel\": {\n" +
            "            \"title\": \"百雀羚小雀幸静润补水保湿面膜女 海藻芦荟膜贴舒缓清爽补水弹润\",\n" +
            "            \"quantity\": 23626,\n" +
            "            \"online\": true,\n" +
            "            \"itemId\": 522099256204,\n" +
            "            \"discountPrice\": 0.0,\n" +
            "            \"itemDetailUrl\": \"//detail.tmall.com/item.htm?id=522099256204\",\n" +
            "            \"pictUrl\": \"//img.alicdn.com/bao/uploaded/i4/519286239/O1CN01wmwpGC1vxVXo9R09i_!!0-item_pic.jpg\",\n" +
            "            \"reservePrice\": 24000.00,\n" +
            "            \"mallItem\": true,\n" +
            "            \"startsStr\": \"2018-03-22 09:03:49\",\n" +
            "            \"itemPicUrl\": \"//img.alicdn.com/bao/uploaded/i4/519286239/O1CN01wmwpGC1vxVXo9R09i_!!0-item_pic.jpg\",\n" +
            "            \"starts\": 1521680629000\n" +
            "          },\n" +
            "          \"buyerCnt\": 237,\n" +
            "          \"payItemQty\": 323,\n" +
            "          \"gmv\": 3078433.0\n" +
            "        },\n" +
            "        {\n" +
            "          \"payAmt\": 1776052.0,\n" +
            "          \"addCartItemCnt\": 240,\n" +
            "          \"itemFavCnt\": 58,\n" +
            "          \"auctionId\": 524767010499,\n" +
            "          \"indexValue\": 0,\n" +
            "          \"uv\": 3787,\n" +
            "          \"pv\": 9112,\n" +
            "          \"payRate\": 0.95,\n" +
            "          \"itemModel\": {\n" +
            "            \"title\": \"百雀羚肌初赋活补水保湿套装正品女水乳霜抗皱紧致护肤品套装\",\n" +
            "            \"quantity\": 1450,\n" +
            "            \"online\": true,\n" +
            "            \"itemId\": 524767010499,\n" +
            "            \"discountPrice\": 0.0,\n" +
            "            \"itemDetailUrl\": \"//detail.tmall.com/item.htm?id=524767010499\",\n" +
            "            \"pictUrl\": \"//img.alicdn.com/bao/uploaded/i4/519286239/O1CN01X2ZcOV1vxVXeToqsV_!!0-item_pic.jpg\",\n" +
            "            \"reservePrice\": 55800.00,\n" +
            "            \"mallItem\": true,\n" +
            "            \"startsStr\": \"2018-12-17 00:26:56\",\n" +
            "            \"itemPicUrl\": \"//img.alicdn.com/bao/uploaded/i4/519286239/O1CN01X2ZcOV1vxVXeToqsV_!!0-item_pic.jpg\",\n" +
            "            \"starts\": 1544977616000\n" +
            "          },\n" +
            "          \"buyerCnt\": 36,\n" +
            "          \"payItemQty\": 37,\n" +
            "          \"gmv\": 1776052.0\n" +
            "        },\n" +
            "        {\n" +
            "          \"payAmt\": 1235284.0,\n" +
            "          \"addCartItemCnt\": 309,\n" +
            "          \"itemFavCnt\": 62,\n" +
            "          \"auctionId\": 7805869963,\n" +
            "          \"indexValue\": 0,\n" +
            "          \"uv\": 3285,\n" +
            "          \"pv\": 7461,\n" +
            "          \"payRate\": 3.62,\n" +
            "          \"itemModel\": {\n" +
            "            \"title\": \"百雀羚水嫩倍现盈透精华水 补水保湿爽肤水女收缩毛孔定妆化妆水\",\n" +
            "            \"quantity\": 7185,\n" +
            "            \"online\": true,\n" +
            "            \"itemId\": 7805869963,\n" +
            "            \"discountPrice\": 0.0,\n" +
            "            \"itemDetailUrl\": \"//detail.tmall.com/item.htm?id=7805869963\",\n" +
            "            \"pictUrl\": \"//img.alicdn.com/bao/uploaded/i3/519286239/O1CN010dXk2L1vxVXcHvrgp_!!0-item_pic.jpg\",\n" +
            "            \"reservePrice\": 9800.00,\n" +
            "            \"mallItem\": true,\n" +
            "            \"startsStr\": \"2018-09-20 09:31:47\",\n" +
            "            \"itemPicUrl\": \"//img.alicdn.com/bao/uploaded/i3/519286239/O1CN010dXk2L1vxVXcHvrgp_!!0-item_pic.jpg\",\n" +
            "            \"starts\": 1537407107000\n" +
            "          },\n" +
            "          \"buyerCnt\": 119,\n" +
            "          \"payItemQty\": 128,\n" +
            "          \"gmv\": 1235284.0\n" +
            "        }\n" +
            "      ]";

    private static String str3 = "{\n" +
            "  \"itemModel\": \"quantity\",\n" +
            "  \"itemModel\": \"reservePrice\",\n" +
            "  \"itemModel\": \"online\",\n" +
            "  \"uv\": null,\n" +
            "  \"payAmt\": null,\n" +
            "  \"payItemQty\": null,\n" +
            "  \"addCartItemCnt\": null,\n" +
            "  \"itemFavCnt\": null\n" +
            "}";
}
