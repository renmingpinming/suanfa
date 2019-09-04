package design.pattern.factory.method;

/**
 * @Author:XiaoLang
 * @Date:2019-09-03 22:26
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleVeggiePizza();
        }else if(type.equals("veggie")){
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
