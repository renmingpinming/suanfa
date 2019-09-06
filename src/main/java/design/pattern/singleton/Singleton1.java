package design.pattern.singleton;

/**
 * @Author:XiaoLang
 * @Date:2019-09-05 21:36
 * 饿汉模式：线程安全，不能延迟加载
 */
public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return singleton;
    }
}
