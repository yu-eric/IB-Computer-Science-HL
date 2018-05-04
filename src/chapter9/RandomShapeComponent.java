package chapter9;

import javax.swing.*;
import java.awt.*;

/**
 * Draws a random shape
 */
public class RandomShapeComponent extends JComponent {

    /**
     * Paints a shape
     * @param g graphics object
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        RandomShapeGenerator randomShape = new RandomShapeGenerator(getWidth(), getHeight());
        for(int i = 0; i < 10; i++) {
            g2.draw(randomShape.randomShape());
        }

    }
}
