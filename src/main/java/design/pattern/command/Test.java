package design.pattern.command;

import design.pattern.command.command.Command;
import design.pattern.command.command.LightOffCommand;
import design.pattern.command.command.LightOnCommand;

/**
 * @Author:XiaoLang
 * @Date:2019-09-06 21:25
 */
public class Test {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light1 = new Light("light 1111");
        Command lightOnCommand1 = new LightOnCommand(light1);
        Command lightOffCommand1 = new LightOffCommand(light1);
        remoteControl.setCommand(0,lightOnCommand1,lightOffCommand1);
        Light light2 = new Light("light 2222");
        Command lightOnCommand2 = new LightOnCommand(light2);
        Command lightOffCommand2 = new LightOffCommand(light2);
        remoteControl.setCommand(1,lightOnCommand2,lightOffCommand2);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undo();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undo();
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undo();
    }
}
