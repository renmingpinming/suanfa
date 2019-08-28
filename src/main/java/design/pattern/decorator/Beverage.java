package design.pattern.decorator;

/**
 * @Author:XiaoLang
 * @Date:2019-08-28 20:31
 */
public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
