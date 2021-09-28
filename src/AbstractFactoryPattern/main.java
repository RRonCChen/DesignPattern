package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.MacProductFactory;
import AbstractFactoryPattern.Factory.ProductFactory;
import AbstractFactoryPattern.Factory.WindowsProductFactory;

public class main {
    public static void main(String[] args) {
        showProduct("Mac");
        showProduct("Windows");
    }

    public static void showProduct(String osType) {
        ProductFactory productFactory;

        if (osType.equals("Mac")) {
            productFactory = new MacProductFactory();
        } else if (osType.equals("Windows")) {
            productFactory = new WindowsProductFactory();
        } else {
            System.out.println("找不到對應osType");
            return;
        }

        productFactory.createProductA().showDetail();
        productFactory.createProductB().print();
    }
}
