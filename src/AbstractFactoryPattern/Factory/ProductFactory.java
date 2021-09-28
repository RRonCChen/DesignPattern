package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Product.ProductA;
import AbstractFactoryPattern.Product.ProductB;

public interface ProductFactory {
    ProductA createProductA();
    ProductB createProductB();
}
