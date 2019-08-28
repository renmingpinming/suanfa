package design.pattern.decorator.deco;

import design.pattern.decorator.Beverage;
import design.pattern.decorator.CondimentDecorator;

/**
 * @Author:XiaoLang
 * @Date:2019-08-28 20:37
 */
public class Mocha extends CondimentDecorator {
    public Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return 0.2+beverage.cost();
    }
}
