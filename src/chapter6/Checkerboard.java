package chapter6;

import javax.swing.*;
import java.awt.*;

/**
 * Creates a black and red checkerboard
 */
public class Checkerboard extends JFrame{

    /**
     * Paints the checkered squares
     * @param g the graphics object
     */
    public void paint(Graphics g) {
        int x;
        int y;
        int row;
        int column;

        for(row = 0; row < 8; row ++) {

            for(column = 0; column < 8; column++) {

                x = column * 50;
                y = row * 50 + 20;

                if((column % 2) == (row % 2)) {
                    g.setColor(Color.RED);

                } else {
                    g.setColor(Color.BLACK);
                }

                if(row == 0) {
                    g.fillRect(x, y, 50, 60);

                } else {
                    g.fillRect(x, y, 50, 50);
                }
            }
        }
    }
}
