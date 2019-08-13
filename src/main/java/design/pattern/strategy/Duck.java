package design.pattern.strategy;

import design.pattern.strategy.behavior.FlyBehavior;
import design.pattern.strategy.behavior.QuackBehavior;
import lombok.Data;

/**
 * @Author:XiaoLang
 * @Date:2019-08-14 07:16
 */
@Data
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("游泳");
    }
}
