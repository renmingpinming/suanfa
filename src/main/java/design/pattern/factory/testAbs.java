package design.pattern.factory;


import design.pattern.factory.abstract_.CNPizzaStore;
import design.pattern.factory.abstract_.NYPizzaStore;
import design.pattern.factory.abstract_.pizza.Pizza;
import design.pattern.factory.abstract_.pizza.PizzaStore;

/**
 * @Author:XiaoLang
 * @Date:2019-09-03 22:19
 */
public class testAbs {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore cnPizzaStore = new CNPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        Pizza pizza2 = cnPizzaStore.orderPizza("cheese");
    }
}
