package zhou.yi.test3;

/**
 * @Author:XiaoLang
 * @Date:2019-08-22 11:27
 */
public class WhileTest {
    public static void main(String[] args) {
        while (true){
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
