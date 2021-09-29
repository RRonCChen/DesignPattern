package StrategyPattern.Context;

import StrategyPattern.Strategy.DollarConverter;

public class DollarCalculater {
    private DollarConverter dollarConverter;

    public DollarCalculater(){}

    public DollarCalculater(DollarConverter dollarConverter) {
        this.dollarConverter = dollarConverter;
    }

    public void setDollarConverter(DollarConverter dollarConverter) {
        this.dollarConverter = dollarConverter;
    }

    public double calculate(int TWD) {
        return (dollarConverter == null) ?
                TWD : dollarConverter.convert(TWD);
    }

}
