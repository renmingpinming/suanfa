package zhou.yi.ocr;

/**
 * @Author: XiaoLang
 * @Date: 2019/1/25 14:59
 */

import zhou.yi.ocr.Base64Util;
import zhou.yi.ocr.FileUtil;
import zhou.yi.ocr.HttpUtil;

import java.net.URLEncoder;

/**
 * OCR 通用识别
 */
public class General {

    public static void main(String[] args) {
        // 通用识别url
        String otherHost = "https://aip.baidubce.com/rest/2.0/ocr/v1/accurate_basic";
//        String otherHost = "https://aip.baidubce.com/rest/2.0/ocr/v1/accurate";
//        String otherHost = "https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic";
//        String otherHost = "https://aip.baidubce.com/rest/2.0/ocr/v1/webimage";
//        String otherHost = "https://aip.baidubce.com/rest/2.0/ocr/v1/numbers";
        // 本地图片路径
        String filePath = "C:/Users/User/Desktop/pic/102.png";
        try {
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = "24.38b1742aff4b84acb7fa81c916fffb21.2592000.1550991223.282335-15487508";
            String result = HttpUtil.post(otherHost, accessToken, params);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
