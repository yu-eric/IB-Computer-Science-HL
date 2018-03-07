package chapter9;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class DrawTriangleTester extends DrawTriangle {

    public static void main(String[] args) {

        ArrayList<Integer> coordinateStorage = new ArrayList<Integer>();

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Draw your own triangle!");
        frame.setVisible(true);

        DrawTriangle mouseCoordinate = new DrawTriangle();
        for(int i = 0; i < 3; i++) {
            mouseCoordinate.mouseClicked();
        }
    }
}
