package zhou.yi.test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/8 14:13
 */
public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^https:.*");
        String s = "https://img.alicdn.com/imgextra/i2/1761495540/O1CN01Al7MzR1qnMk9BzMV7_!!0-item_pic.jpg_430x430q90.jpg";
        String s1 = "//img.alicdn.com/imgextra/i2/1761495540/O1CN01Al7MzR1qnMk9BzMV7_!!0-item_pic.jpg_430x430q90.jpg";
        Matcher matcher = pattern.matcher(s1);
        System.out.println(matcher.matches());
        Pattern pattern2 = Pattern.compile("^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$");
        Matcher matcher2 = pattern2.matcher("13826875930");
        System.out.println(matcher2.matches());
    }
}
