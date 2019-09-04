package design.pattern.factory.method;

/**
 * @Author:XiaoLang
 * @Date:2019-09-03 22:28
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza(){
        name = "NY style Veggie";
        douth = "Extra Thin Crust Dough";
        sauce = "Plum Tomato Sauce";

        topping.add("Sharedded Raggiano Cheese");
    }

    void cut(){
        System.out.println("xxxxxx");
    }
}
