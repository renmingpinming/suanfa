package design.pattern.singleton;

/**
 * @Author:XiaoLang
 * @Date:2019-09-05 21:37
 * 懒汉式  双重检测锁+volatile禁止语义重排。
 */
public class Singleton2 {
    private volatile static Singleton2 singleton;

    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        if (singleton == null){
            synchronized(Singleton2.class){
                if(singleton == null){
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
