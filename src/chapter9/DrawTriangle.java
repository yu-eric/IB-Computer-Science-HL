package chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class DrawTriangle extends JComponent {
    public static final int MAX_POINTS = 3;
    private Point2D points[];
    private int numPoints;

    /**
     * Creates a new Triangle Component
     */
    public DrawTriangle() {
        points = new Point2D[MAX_POINTS];
        numPoints = 0;
    }

    /**
     * Creates the first point
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public void setFirstPoint(int x, int y) {
        setPoint(x, y, 0);
    }

    /**
     * Creates the second point
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public void setSecondPoint(int x, int y) {
        setPoint(x, y, 1);
    }

    /**
     * Creates the third point
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public void setThirdPoint(int x, int y) {
        setPoint(x, y, 2);
    }

    /**
     * Creates a point and stores it
     * @param x x-coordinate
     * @param y y-coordinate
     * @param index index of point
     */
    public void setPoint(int x, int y, int index) {
        if(index >= 0 && index <= MAX_POINTS) {
            Point2D point = new Point2D.Double(x, y);
            points[index] = point;
            numPoints++;
        }
    }

    public void clear() {
        numPoints = 0;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        if(numPoints > 0) {
            g2.draw(new Ellipse2D.Double(points[0].getX(), points[0].getY(), 1, 1));
        }
        if(numPoints > 1) {
            g2.draw(new Line2D.Double(points[0], points[1]));
        }
        if(numPoints > 2) {
            g2.draw(new Line2D.Double(points[1], points[2]));
            g2.draw(new Line2D.Double(points[2], points[0]));
        }
    }
}