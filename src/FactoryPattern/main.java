package FactoryPattern;

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
