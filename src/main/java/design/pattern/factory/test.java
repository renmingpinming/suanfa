package design.pattern.factory;

import design.pattern.factory.method.ChicagoPizzaStore;
import design.pattern.factory.method.NYPizzaStore;
import design.pattern.factory.method.Pizza;
import design.pattern.factory.method.PizzaStore;

/**
 * @Author:XiaoLang
 * @Date:2019-09-03 22:19
 */
public class test {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicaoSotre = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        Pizza pizza1 = chicaoSotre.orderPizza("cheese");
        System.out.println();
    }
}
