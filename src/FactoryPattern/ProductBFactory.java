package FactoryPattern;

public class ProductBFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
