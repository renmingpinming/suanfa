package design.pattern.adapter;

/**
 * @Author:XiaoLang
 * @Date:2019-09-18 07:41
 */
public class Test {
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        duck.quack();
        duck.fly();
        WildTurkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
