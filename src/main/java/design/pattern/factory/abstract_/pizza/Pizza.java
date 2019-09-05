package design.pattern.factory.abstract_.pizza;

import design.pattern.factory.abstract_.Ingredient.*;

import java.util.ArrayList;

/**
 * @Author:XiaoLang
 * @Date:2019-09-03 22:20
 */
public abstract class Pizza {
    String name;
    Dough douth;
    Sauce sauce;
    Viggies[] viggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
