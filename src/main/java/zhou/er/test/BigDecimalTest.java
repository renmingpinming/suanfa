package zhou.er.test;

import java.math.BigDecimal;

/**
 * @Author:XiaoLang
 * @Date:2019-09-25 15:51
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal(10).setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(num);
    }
}
