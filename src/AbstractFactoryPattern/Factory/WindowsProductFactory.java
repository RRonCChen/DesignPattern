package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Product.ProductA;
import AbstractFactoryPattern.Product.ProductB;
import AbstractFactoryPattern.Product.WindowsProductA;
import AbstractFactoryPattern.Product.WindowsProductB;

public class WindowsProductFactory implements ProductFactory{
    @Override
    public ProductA createProductA() {
        return new WindowsProductA();
    }

    @Override
    public ProductB createProductB() {
        return new WindowsProductB();
    }
}
