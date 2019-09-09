package zhou.yi.test;

import java.util.*;

public class test {
    public static void main(String[] args) {
//        Map<Integer,String> map1 = new HashMap<Integer, String>();
//        map1.put(1,"hello");
//        map1.put(2,"world");
//        map1.put(3,"zhou");
//        map1.put(3,"yi");
//        map1.remove(3);
//        Iterator iter = map1.keySet().iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }
//        System.out.println(map1.get(1));
//
//        BigDecimal bigDecimal = new BigDecimal(-10);
//        System.out.println(bigDecimal);

//        List<String> list1 = new ArrayList<String>();
//        list1.add("a");
//        list1.add("B");
//        list1.remove("a");
//        list1.remove("b");
//        System.out.println(list1);
//
//        Set<String> set1 = new HashSet<String>();
//        set1.add("c");
//        set1.add("D");
//        set1.remove("c");
//        set1.remove("d");
//        System.out.println(set1);

//        BigDecimal Test = null;
//        BigDecimal y = new BigDecimal(10);
//        y.add(Test);
        test t = new test();
//        String tidSet = "1,2,3,6,5,8,1,2,6,11";
        String tidSet = "1";
        tidSet = t.distinctTidSet(tidSet);
        System.out.println(tidSet);
    }


    public String distinctTidSet(String tidSet) {
        String[] tids = tidSet.split(",");
        if (tids.length == 1) {
            return tidSet;
        }
        Set<String> tidSetDis = new HashSet<String>();
        for (String tid : tids) {
            tidSetDis.add(tid);
        }
        StringBuilder rstS = new StringBuilder();
        for (String tid : tidSetDis) {
            rstS.append(tid).append(",");
        }
        String rst = rstS.toString();
        return rst.substring(0, rst.length() - 1);
    }

    public void xxx() {

    }

}
