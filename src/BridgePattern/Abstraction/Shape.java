package BridgePattern.Abstraction;

import BridgePattern.Implementation.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void drawColor();

}
