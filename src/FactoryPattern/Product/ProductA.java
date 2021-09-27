package FactoryPattern.Product;

import FactoryPattern.Product.Product;

public class ProductA implements Product {

    @Override
    public void showDetail() {
        System.out.println("I'm productA");
    }
}
