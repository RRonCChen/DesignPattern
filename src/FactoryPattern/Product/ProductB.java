package FactoryPattern.Product;

import FactoryPattern.Product.Product;

public class ProductB implements Product {
    @Override
    public void showDetail() {
        System.out.println("I'm productB");
    }
}
