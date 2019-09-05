package design.pattern.factory.abstract_;

import design.pattern.factory.abstract_.Ingredient.*;

/**
 * @Author:XiaoLang
 * @Date:2019-09-05 07:36
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ADough();
    }

    @Override
    public Sauce createSauce() {
        return new ASauce();
    }

    @Override
    public Cheese createCheese() {
        return new ACheese();
    }

    @Override
    public Viggies[] createViggies() {
        Viggies[] viggies =  {new AViggies()};
        return viggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new APepperoni();
    }

    @Override
    public Clams createClams() {
        return new AClams();
    }
}
