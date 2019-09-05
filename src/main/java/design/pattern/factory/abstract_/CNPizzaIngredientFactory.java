package design.pattern.factory.abstract_;

import design.pattern.factory.abstract_.Ingredient.*;

/**
 * @Author:XiaoLang
 * @Date:2019-09-05 07:36
 */
public class CNPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new BDough();
    }

    @Override
    public Sauce createSauce() {
        return new BSauce();
    }

    @Override
    public Cheese createCheese() {
        return new BCheese();
    }

    @Override
    public Viggies[] createViggies() {
        Viggies[] viggies =  {new BViggies()};
        return viggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new BPepperoni();
    }

    @Override
    public Clams createClams() {
        return new BClams();
    }
}
