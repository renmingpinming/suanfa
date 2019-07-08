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
    }
}
