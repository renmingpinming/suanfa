package design.pattern.factory.method;

import java.util.ArrayList;

/**
 * @Author:XiaoLang
 * @Date:2019-09-03 22:20
 */
public abstract class Pizza {
    String name;
    String douth;
    String sauce;
    ArrayList topping = new ArrayList();

    void prepare(){
        System.out.println("preparing"+name);
        System.out.println("Tossing douth"+douth);
        System.out.println("Adding sauce"+sauce);
        System.out.println("Adding topping");
        for(int i = 0;i < topping.size();i++){
            System.out.println("  "+topping.get(i));
        }
    }

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
}
