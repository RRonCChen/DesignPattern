package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Product.MacProductA;
import AbstractFactoryPattern.Product.MacProductB;
import AbstractFactoryPattern.Product.ProductA;
import AbstractFactoryPattern.Product.ProductB;

public class MacProductFactory implements ProductFactory{
    @Override
    public ProductA createProductA() {
        return new MacProductA();

    }

    @Override
    public ProductB createProductB() {
        return new MacProductB();
    }
}
