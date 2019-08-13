package design.pattern.strategy.behavior;

/**
 * @Author:XiaoLang
 * @Date:2019-08-14 07:25
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("mutequack");
    }
}
