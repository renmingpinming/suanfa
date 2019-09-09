package design.pattern.command.command;

/**
 * @Author:XiaoLang
 * @Date:2019-09-06 21:31
 */
public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("no command");
    }

    @Override
    public void undo() {
        System.out.println("no command");
    }
}
