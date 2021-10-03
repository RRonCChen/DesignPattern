package CommandPattern;

import CommandPattern.Command.JPDCommand;
import CommandPattern.Command.USDCommand;
import CommandPattern.Invoker.Invoker;
import CommandPattern.Receiver.JPConverter;

public class main {
    public static void main(String[] args) {
        JPDCommand jPDCommand = new JPDCommand();
        Invoker invoker = new Invoker(jPDCommand);
        System.out.println("JPD : "+invoker.execute(1000));

        invoker.setCommand(new USDCommand());
        System.out.println("USD : "+invoker.execute(1000));
    }
}
