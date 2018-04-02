package chapter9;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawTriangleFrame extends JFrame{

    private DrawTriangle component;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;

    /**
     * Creates the window and mouse input to draw the triangle
     */
    public DrawTriangleFrame() {
        component = new DrawTriangle();

        class MouseClickedListener implements MouseListener {
            public static final int MAX_CLICKS = 3;
            private int clicks = 0;
            @Override
            public void mouseClicked(MouseEvent e) {
                if(clicks > MAX_CLICKS) {
                    component.clear();
                    clicks = 0;
                }
                int xpos = e.getX();
                int ypos = e.getY();

                if(clicks == 0) {
                    component.setFirstPoint(xpos, ypos);
                } else if(clicks == 1) {
                    component.setSecondPoint(xpos, ypos);
                } else if(clicks == 2) {
                    component.setThirdPoint(xpos, ypos);
                }
                repaint();
                clicks++;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //not used
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        }

        MouseClickedListener listener = new MouseClickedListener();
        component.addMouseListener(listener);

        setSize(WIDTH, HEIGHT);
        setTitle("Triangle Drawer");
        add(component);

    }
}
