package design.pattern.factory.abstract_;


import design.pattern.factory.abstract_.pizza.CheesePizza;
import design.pattern.factory.abstract_.pizza.ClamPizza;
import design.pattern.factory.abstract_.pizza.Pizza;
import design.pattern.factory.abstract_.pizza.PizzaStore;

/**
 * @Author:XiaoLang
 * @Date:2019-09-03 22:26
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        design.pattern.factory.abstract_.pizza.Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new  NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York CheesePizza");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York ClamPizza");
        }
        return pizza;
    }
}
