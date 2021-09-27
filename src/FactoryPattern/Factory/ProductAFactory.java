package FactoryPattern.Factory;

import FactoryPattern.Product.Product;
import FactoryPattern.Product.ProductA;

public class ProductAFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
