package CommandPattern.Command;

import CommandPattern.Receiver.TWDollarConvert;

public interface Command {
    double execute(int TWD);
}
