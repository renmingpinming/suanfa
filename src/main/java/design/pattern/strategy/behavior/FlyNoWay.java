package design.pattern.strategy.behavior;

/**
 * @Author:XiaoLang
 * @Date:2019-08-14 07:24
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly No Way");
    }
}
