package zhou.yi.util;

import lombok.Data;

/**
 * @Author:XiaoLang
 * @Date:2019-08-13 16:35
 */
@Data
public class PicPo {
    private String picName;
    private String picUrl;
    private String uploadPicUrl;

    public static void main(String[] args) {
        PicPo picPo = new PicPo();
        picPo.setPicName("xx");
        System.out.println(picPo.toString());
    }
}
