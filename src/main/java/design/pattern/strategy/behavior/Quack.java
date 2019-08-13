package design.pattern.strategy.behavior;

/**
 * @Author:XiaoLang
 * @Date:2019-08-14 07:25
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
