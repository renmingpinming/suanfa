package design.pattern.decorator;

import design.pattern.decorator.deco.Mocha;
import design.pattern.decorator.deco.Whip;
import design.pattern.decorator.entity.Espresso;
import design.pattern.decorator.entity.HouseBlend;

/**
 * @Author:XiaoLang
 * @Date:2019-08-28 20:40
 */
public class Test {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+"$"+beverage1.cost());
    }
}
