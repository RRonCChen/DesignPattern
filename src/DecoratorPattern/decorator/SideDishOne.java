package DecoratorPattern.decorator;

import DecoratorPattern.conpoment.Meal;

public class SideDishOne extends MealDecorator {

    public SideDishOne(Meal meal) {
        super(meal);
    }

    @Override
    public String getContent() {
        return meal.getContent() + " + Soup";
    }

    @Override
    public int getPrice() {
        return meal.getPrice() + 20;
    }
}
