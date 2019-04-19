package zhou.yi.test2;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/19 9:14
 */
public class SortedSetTest {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet,"one two three four five six seven eight".split(" "));
        System.out.println(sortedSet);
        Iterator<String> it = sortedSet.iterator();
        String low = sortedSet.first();
        String high = sortedSet.last();
        for(int i = 0;i <= 6;i++){
            if(i == 3){
                low = it.next();
            }
            if(i == 6){
                high = it.next();
            }
            else {
                it.next();
            }
        }
        System.out.println(low);
        System.out.println(high);
    }
}
