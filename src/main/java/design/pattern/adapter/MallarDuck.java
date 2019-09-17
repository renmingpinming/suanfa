package design.pattern.adapter;

/**
 * @Author:XiaoLang
 * @Date:2019-09-18 07:31
 */
public class MallarDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Qucak");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
