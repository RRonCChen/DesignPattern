package CommandPattern.Receiver;

public class USDConverter implements TWDollarConvert{
    @Override
    public double convert(int TWD) {
        return TWD / 27.8;
    }
}
