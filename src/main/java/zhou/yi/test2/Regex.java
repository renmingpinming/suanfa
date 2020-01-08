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

        String str = "https://detail.tmall.com/item.htm?spm=a1z10.3-b.w4011-14634202018.83.6bf165" +
                "74Una1QS&id=557195758698&rn=e24627e2616911f728c1baf99c2a8c4d&abbucket=20&id=3879527036315";
        Pattern patternId = Pattern.compile("(?<=&id=)\\d*");
        Matcher matcherId = patternId.matcher(str);
        while (matcherId.find()){
            System.out.println(matcherId.group(0));
        }

        String str3 = "https://detaojbkil.tmall.com/item.";
        Pattern pattern3 = Pattern.compile(".*(NTM|cnm|ojbk|cao|NMZL|XB|xb|shabi|shab|mdzz|MLGB|MMP|fuck|MD|NC|JB|sb|SB|TMD|tmd|IOPE).*");
        Matcher matcher3 = pattern3.matcher(str3);
        System.out.println(matcher3.matches());

        String str4 = "@#我是客服登记内容#@";
        Pattern pattern4 = Pattern.compile("(?<=@#).*?(?=#@)");
        Matcher matcher4 = pattern4.matcher(str4);
        while (matcher4.find()){
            System.out.println(matcher4.group(0));
        }

        String str5 = "    \"errorMsg\": \"Validation failed for argument at index 2 in method: public void com.onechance" +
                ".xingtu.server.controller.ProjectController.saveOrUpdateProject(javax.servlet.http.HttpServletRequest,javax.servle" +
                "t.http.HttpServletResponse,com.onechance.xingtu.server.biz.model.ProjectForm), with 1 error(s): [Field error in object " +
                "'projectForm' on field 'name': rejected value [null]; codes [NotBlank.projectForm.name,NotBlank.name,NotBlank.java.lang.String" +
                ",NotBlank]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [projectForm.name,name]; argum" +
                "ents []; default message [name]]; default message [name不能为空]] \",";
        Pattern pattern5 = Pattern.compile("(?<=default message \\[).*?(?=])");
        Matcher matcher5 = pattern5.matcher(str5);
        while (matcher5.find()){
            System.out.println(matcher5.group(0));
        }
    }
}
