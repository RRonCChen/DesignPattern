package BridgePattern;

import BridgePattern.Abstraction.Circle;
import BridgePattern.Abstraction.Rectangle;
import BridgePattern.Implementation.BlueColor;
import BridgePattern.Implementation.RedColor;

public class main {
    public static void main(String[] args) {
        Rectangle bludRect = new Rectangle(new BlueColor());
        bludRect.drawColor();

        Circle redCircle = new Circle(new RedColor());
        redCircle.drawColor();
    }
}
