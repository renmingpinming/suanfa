package zhou.yi.test2;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/6/19 10:26
 */
public class ToList {
    public static void main(String[] args) {
        Long[] longOne = new Long[]{};
        List<Long> r = Arrays.asList(longOne);
        System.out.println(r);
    }
}
