package zhou.yi.leetCode.easy2;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/17 18:14
 */
public class _38 {
    public String countAndSay(int n) {
        String str = "1";
        while (--n > 0){
            int times = 1;
            char[] chars = str.toCharArray();
            int len = chars.length;
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < len;i++){
                if(chars[i - 1] == chars[i]){
                    times++;
                }else {
                    sb.append(times).append(chars[i - 1]);
                    times = 1;
                }
            }
            str = sb.append(times).append(chars[len - 1]).toString();
        }
        return str;
    }

    public static void main(String[] args) {
        _38 test = new _38();
        System.out.println(test.countAndSay(6));
    }
}
