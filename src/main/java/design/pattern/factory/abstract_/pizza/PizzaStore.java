package design.pattern.factory.abstract_.pizza;


/**
 * @Author:XiaoLang
 * @Date:2019-09-03 22:20
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
