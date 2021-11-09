package BridgePattern.Abstraction;

import BridgePattern.Implementation.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void drawColor() {
        System.out.println("Circle filled with " + color.fillColor());
    }
}
