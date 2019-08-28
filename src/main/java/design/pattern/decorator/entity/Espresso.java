package design.pattern.decorator.entity;

import design.pattern.decorator.Beverage;

/**
 * @Author:XiaoLang
 * @Date:2019-08-28 20:35
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
