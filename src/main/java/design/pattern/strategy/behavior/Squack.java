package design.pattern.strategy.behavior;

/**
 * @Author:XiaoLang
 * @Date:2019-08-14 07:26
 */
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squack");
    }
}
