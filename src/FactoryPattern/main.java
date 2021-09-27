package FactoryPattern;

import FactoryPattern.Factory.ProductAFactory;
import FactoryPattern.Factory.ProductBFactory;
import FactoryPattern.Factory.ProductFactory;
import FactoryPattern.Product.Product;

public class main {

    public static void main(String[] args) {
        ProductFactory factoryA = new ProductAFactory();
        ProductFactory factoryB = new ProductBFactory();

        createAndShowProduct(factoryA);
        createAndShowProduct(factoryB);
    }

    public static void createAndShowProduct(ProductFactory productFactory){
        Product product = productFactory.createProduct();
        product.showDetail();
    }
}
