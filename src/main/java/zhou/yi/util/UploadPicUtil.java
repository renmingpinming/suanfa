package zhou.yi.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author:XiaoLang
 * @Date:2019-08-13 17:03
 */
public class UploadPicUtil {

    public static final String PIC_URL_PREFIX = "http://aftersale-pic.dajiaok.com/";
    public static final String UPLOAD_PATH = "/home/web-static/after-sale-pic/";
    /**
     * 获取图片URL
     * @param file
     * @return
     * @throws BizException
     */
    public static PicPo uploadFile(MultipartFile file)throws BizException {
        String contentType =file.getContentType();
        Pattern pattern = Pattern.compile("image/.*");
        Matcher matcher = pattern.matcher(contentType);
        String path=null;// 文件路径
        String type=null;// 文件类型
        String trueFileName = null;//文件新名称
        if(matcher.matches()){
            type = contentType.substring(6,contentType.length());
            // 自定义的文件名称
            trueFileName=String.valueOf(System.currentTimeMillis())+new Random().nextInt(1000)+"."+type;
            // 设置存放图片文件的路径
            path=UPLOAD_PATH+trueFileName;
            // 转存文件到指定的路径
            try {
                file.transferTo(new File(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            throw new BizException(BizException.ExceptionType.INPUT_ERR,"文件类型不是图片");
        }
        //设置读取url，更新数据
        StringBuilder picUrl = new StringBuilder();
        picUrl.append(PIC_URL_PREFIX).append(trueFileName);
        PicPo rst = new PicPo();
        rst.setPicName(trueFileName);
        rst.setPicUrl(picUrl.toString());
        return rst;
    }
}
