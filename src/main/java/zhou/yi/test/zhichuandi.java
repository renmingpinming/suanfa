package zhou.yi.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/3/2 16:41
 */
public class zhichuandi {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        test1(nums);
        System.out.println(nums);
        Integer a = 3;
        test2(a);
        System.out.println(a);
    }

    public static void test1(List<Integer> nums2) {
        nums2.add(3);
    }

    public static void test2(Integer nums2) {
        nums2 = 5;
    }
}
