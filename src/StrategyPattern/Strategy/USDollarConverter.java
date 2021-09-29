package StrategyPattern.Strategy;

public class USDollarConverter implements DollarConverter {
    @Override
    public double convert(int TWD) {
        return TWD / 27.8;
    }
}
