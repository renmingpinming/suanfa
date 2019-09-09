package design.pattern.command.command;

import design.pattern.command.Light;

/**
 * @Author:XiaoLang
 * @Date:2019-09-06 21:29
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
