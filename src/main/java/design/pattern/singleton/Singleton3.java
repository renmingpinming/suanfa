package design.pattern.singleton;

/**
 * @Author:XiaoLang
 * @Date:2019-09-05 21:42
 *
 * 调用:  SomeThing.INSTANCE.getInstance()
 */
public enum Singleton3 {
    INSTANCE;
    private SingletonRes instance;

    Singleton3(){
        instance = new SingletonRes();
    }

    public SingletonRes getInstance(){
        return instance;
    }

}
