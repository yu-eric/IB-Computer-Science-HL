package chapter9;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height){
        super.setLocation(x, y);
        super.setSize(width, height);
    }

    public double getArea() {
        return super.getHeight() * super.getWidth();
    }

    public double getPerimeter() {
        return (super.getHeight() * 2) + (super.getWidth() * 2);
    }

}
