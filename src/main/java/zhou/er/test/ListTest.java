package zhou.er.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:XiaoLang
 * @Date:2019-10-24 10:56
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> tidList = new ArrayList<>();
        tidList.add("a");
        tidList.add("s");
        tidList.add("d");
        tidList.add("f");
        tidList.add("g");
        tidList.add("h");
        tidList.add("j");
        tidList.add("k");
        tidList.add("k");
        tidList.add("k");
        int listSize = tidList.size();
        int toIndex=2;
        for(int i = 0;i<tidList.size();i+=2){
            //作用为toIndex最后没有100条数据则剩余几条newList中就装几条
            if(i+2>listSize){
                toIndex=listSize-i;
            }
            List newList = tidList.subList(i,i+toIndex);
            String x = newList.toString().replace(",",";").replace(" ","");
            System.out.println(x.substring(1,x.length() - 1));
        }

        List<String> tidList2 = new ArrayList<>();
        List<String> tidList3 = null;
        for (String s: tidList2) {
            int x = 1;
        }
    }
}
