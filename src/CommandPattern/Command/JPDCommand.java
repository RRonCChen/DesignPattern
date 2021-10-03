package CommandPattern.Command;

import CommandPattern.Receiver.JPConverter;
import CommandPattern.Receiver.TWDollarConvert;

public class JPDCommand implements Command {
    private TWDollarConvert convert;

    @Override
    public double execute(int TWD) {
        TWDollarConvert convert = new JPConverter();
        return convert.convert(TWD);
    }
}
