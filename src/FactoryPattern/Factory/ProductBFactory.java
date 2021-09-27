package FactoryPattern.Factory;

import FactoryPattern.Product.Product;
import FactoryPattern.Product.ProductB;

public class ProductBFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
