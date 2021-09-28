package AbstractFactoryPattern.Product;

public class WindowsProductA implements ProductA{
    @Override
    public void showDetail() {
        System.out.println("Windows ProductA");
    }
}
