package design.pattern.command;

import design.pattern.command.command.Command;
import design.pattern.command.command.NoCommand;

/**
 * @Author:XiaoLang
 * @Date:2019-09-06 21:31
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command history;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        NoCommand noCommand = new NoCommand();
        for(int i = 0;i < 7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        history = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        history = offCommands[slot];
    }

    public void undo(){
        history.undo();
    }
}
