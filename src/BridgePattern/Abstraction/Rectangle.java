package BridgePattern.Abstraction;

import BridgePattern.Implementation.Color;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void drawColor() {
        System.out.println("Rectangle filled with " + color.fillColor());
    }

}
