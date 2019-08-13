package design.pattern.strategy;

import design.pattern.strategy.behavior.FlyWithWings;
import design.pattern.strategy.behavior.Quack;

/**
 * @Author:XiaoLang
 * @Date:2019-08-14 07:27
 * 策略模式
 * 定义了算法族，分别封装起来，让他们之间可以相互替换
 */
public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
        mallardDuck.swim();
    }
}
