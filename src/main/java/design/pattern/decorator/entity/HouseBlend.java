package design.pattern.decorator.entity;

import design.pattern.decorator.Beverage;

/**
 * @Author:XiaoLang
 * @Date:2019-08-28 20:35
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
