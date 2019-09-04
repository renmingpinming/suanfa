package design.pattern.factory.method;

/**
 * @Author:XiaoLang
 * @Date:2019-09-03 22:27
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY style cheese";
        douth = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        topping.add("Grated Raggiano Cheese");
    }
}
