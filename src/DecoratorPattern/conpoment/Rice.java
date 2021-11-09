package DecoratorPattern.conpoment;

public class Rice implements Meal {

    @Override
    public String getContent() {
        return "Rice";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
