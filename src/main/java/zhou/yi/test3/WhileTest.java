package zhou.yi.test3;

import zhou.yi.util.DateUtilSelf;

import java.util.Date;

/**
 * @Author:XiaoLang
 * @Date:2019-08-22 11:27
 */
public class WhileTest {
    public static void main(String[] args) {
        while (true){
            //短信发送时间判断
//            Date date = new Date(1566429873000L);
//            Date date = new Date(1566487473000L);
            Date date = new Date();
            System.out.println(date);
            if (date.before(DateUtilSelf.getToday8())|| date.after(DateUtilSelf.getToday22())){
                break;
            }
            for (int i = 0;i < 10;i++){
                System.out.println(i);
                if(i == 4){
                    break;
                }
            }
            break;
        }
    }
}
