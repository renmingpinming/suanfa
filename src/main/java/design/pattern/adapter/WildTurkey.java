package design.pattern.adapter;

/**
 * @Author:XiaoLang
 * @Date:2019-09-18 07:32
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
