package design.pattern.command;

/**
 * @Author:XiaoLang
 * @Date:2019-09-06 21:28
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name+" on");
    }

    public void off(){
        System.out.println(name+" off");
    }
}
