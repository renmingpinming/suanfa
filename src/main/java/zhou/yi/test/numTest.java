package zhou.yi.test;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * @Author: XiaoLang
 * @Date: 2019/1/24 10:54
 */
public class numTest {
    public static void main(String[] args) {
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        dfs.setGroupingSeparator(',');
        dfs.setMonetaryDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("###,###.##", dfs);

        String aa = "123456789";
        Number num = null;
        try {
            num = df.parse(aa);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Double amountReceivable = num.doubleValue();
        Integer amountReceivable2 = num.intValue();


        String s1 = "21.8%";
        String s2 = "-21.7%";

        NumberFormat numberFormat = NumberFormat.getPercentInstance();
        try {
            Number n1 = numberFormat.parse(s1);
            Number n2 = numberFormat.parse(s2);
            System.out.println(n1 + "" + n2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
