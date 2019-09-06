package zhou.er.test;

import java.util.Iterator;
import java.util.List;

/**
 * @Author:XiaoLang
 * @Date:2019-09-05 15:38
 */
public class LinkedList {
    public static void main(String[] args) {
        List<String> list = new java.util.LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
