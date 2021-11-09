package DecoratorPattern.decorator;

import DecoratorPattern.conpoment.Meal;

public abstract class MealDecorator implements Meal {
    protected Meal meal;

    MealDecorator(Meal meal) {
        this.meal = meal;
    }
}
