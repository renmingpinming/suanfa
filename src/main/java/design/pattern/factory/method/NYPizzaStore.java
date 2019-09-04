package design.pattern.factory.method;

/**
 * @Author:XiaoLang
 * @Date:2019-09-03 22:26
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
