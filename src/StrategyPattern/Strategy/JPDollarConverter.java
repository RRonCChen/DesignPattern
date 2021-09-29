package StrategyPattern.Strategy;

public class JPDollarConverter implements DollarConverter{
    @Override
    public double convert(int TWD) {
        return TWD / 0.25;
    }
}
