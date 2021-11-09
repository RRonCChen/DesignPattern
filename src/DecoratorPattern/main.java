package DecoratorPattern;

import DecoratorPattern.conpoment.Meal;
import DecoratorPattern.conpoment.Rice;
import DecoratorPattern.decorator.SideDishOne;

public class main {
    public static void main(String[] args) {
        Meal meal = new SideDishOne(new Rice());
        System.out.println("Order : " + meal.getContent());
        System.out.println("Total : " + meal.getPrice());
    }
}
