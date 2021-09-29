package StrategyPattern;

import StrategyPattern.Context.DollarCalculater;
import StrategyPattern.Strategy.JPDollarConverter;
import StrategyPattern.Strategy.USDollarConverter;

public class main {

    public static void main(String[] args) {
        DollarCalculater dollarCalculater = new DollarCalculater();
        System.out.println(dollarCalculater.calculate(1000));

        dollarCalculater.setDollarConverter(new USDollarConverter());
        System.out.println(dollarCalculater.calculate(1000));

        dollarCalculater.setDollarConverter(new JPDollarConverter());
        System.out.println(dollarCalculater.calculate(1000));
    }
}
