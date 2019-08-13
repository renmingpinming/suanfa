package design.pattern.strategy.behavior;

/**
 * @Author:XiaoLang
 * @Date:2019-08-14 07:23
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
