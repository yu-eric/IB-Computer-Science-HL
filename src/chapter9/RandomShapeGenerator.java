package chapter9;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

/**
 * This class will provide a random shape
 */
public class RandomShapeGenerator {
    private Random random;
    private int windowWidth;
    private int windowHeight;

    /**
     * Creates a random shape
     * @param windowWidth the width of the window
     * @param windowHeight the height of the window
     */
    public RandomShapeGenerator(int windowWidth, int windowHeight) {
        this.random = new Random();
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
    }

    public Shape randomShape() {
        int shape = random.nextInt(3);
        int x = random.nextInt(windowWidth);
        int y = random.nextInt(windowHeight);

        int width = 30;
        int height = 20;

        switch(shape) {
            case 0:
                return new Rectangle(x, y, width, height);
            case 1:
                return new Ellipse2D.Double(x, y, width, height);
            default:
                return new Line2D.Double(x, y, x + width, y + height);
        }
    }
}
