package FactoryPattern;

public class ProductAFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
