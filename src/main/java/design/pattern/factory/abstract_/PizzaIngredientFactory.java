package design.pattern.factory.abstract_;

import design.pattern.factory.abstract_.Ingredient.*;

/**
 * @Author:XiaoLang
 * @Date:2019-09-05 07:28
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Viggies[] createViggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
