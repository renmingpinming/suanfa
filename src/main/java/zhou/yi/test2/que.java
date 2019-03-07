package zhou.yi.test2;

/**
 * @Author: XiaoLang
 * @Date: 2019/3/2 17:52
 */
public class que {
    static int arr[] = new int[10];
    public static void main(String args[ ]){
        System.out.println(arr[1]);

        //2
        int x= 0;
        int y=10;
        do{
            y--;
            ++x;
        }while(x<6);
        System.out.println(x+"--"+y);

        //3
        complicatedexpression_f();
    }
    static void complicatedexpression_f(){
        int x=20,y=30;
        boolean j;
        j=x>50&&y>60|| x>50&& y<-60 || x<-50&&y>60 || x<-50&& y<-60;
        System.out.println(j);
    }
}
