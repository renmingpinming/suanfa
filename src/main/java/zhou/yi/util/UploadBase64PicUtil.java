package zhou.yi.util;

import org.springframework.web.multipart.MultipartFile;
import zhou.yi.util.base64.Base64Converter;

/**
 * @Author:XiaoLang
 * @Date:2019-09-02 10:35
 */
public class UploadBase64PicUtil {

    /**
     * Base64图片上传
     */
    public static PicPo uploadFile(String source) throws BizException {
        MultipartFile file = Base64Converter.converter(source);
        System.out.println(file);
        PicPo rst = UploadPicUtil.uploadFile(file);
        return rst;
    }
}
