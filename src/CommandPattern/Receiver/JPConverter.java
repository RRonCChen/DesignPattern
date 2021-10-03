package CommandPattern.Receiver;

public class JPConverter implements TWDollarConvert{
    @Override
    public double convert(int TWD) {
        return TWD / 0.25;
    }
}
