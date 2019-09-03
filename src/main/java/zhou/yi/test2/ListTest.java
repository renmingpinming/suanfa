package zhou.yi.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

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

        list1.forEach(l-> System.out.println(l));

        list1.add("d");
        list1.add("e");
        list1.add("f");
        Spliterator<String> x = list1.spliterator();
        System.out.println(x);
        Spliterator<String> x1 = x.trySplit();
        System.out.println(x1);
        Spliterator<String> x2 = x.trySplit();
        System.out.println(x2);
    }
}
