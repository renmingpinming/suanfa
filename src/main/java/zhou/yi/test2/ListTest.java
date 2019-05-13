package zhou.yi.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/13 10:48
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("c");
        list2.add("d");
//        list1.addAll(list2);
//        list1.removeAll(list2);
        list1.retainAll(list2);
        System.out.println(list1);
    }
}
