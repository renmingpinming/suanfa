package design.pattern.factory.abstract_.pizza;

import design.pattern.factory.abstract_.PizzaIngredientFactory;

/**
 * @Author:XiaoLang
 * @Date:2019-09-05 07:50
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("preparing"+name);
        douth = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();
    }
}
