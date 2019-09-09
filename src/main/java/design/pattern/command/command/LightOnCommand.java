package design.pattern.command.command;

import design.pattern.command.Light;

/**
 * @Author:XiaoLang
 * @Date:2019-09-06 21:29
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
