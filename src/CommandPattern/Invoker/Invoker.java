package CommandPattern.Invoker;

import CommandPattern.Command.Command;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public double execute(int TWD) {
        return command.execute(TWD);
    }

}
