package zhou.yi.md5;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Date;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/5 13:40
 */
public class Md5Test {
    public static void main(String[] args) {
        String str = "lahfl";
        str+=new Date();
        System.out.println(str);
        String x = DigestUtils.md5Hex(str);
        System.out.println(x);
    }
}
