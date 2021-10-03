package CommandPattern.Command;

import CommandPattern.Receiver.TWDollarConvert;
import CommandPattern.Receiver.USDConverter;

public class USDCommand implements Command {

    @Override
    public double execute(int TWD) {
        USDConverter converter = new USDConverter();
        return converter.convert(TWD);
    }
}
