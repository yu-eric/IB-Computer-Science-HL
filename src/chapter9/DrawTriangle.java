package chapter9;


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class DrawTriangle extends JFrame {

    ArrayList<Integer> coordinateStorage = new ArrayList<Integer>();
    int x, y;
    public DrawTriangle() {

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = getX();
                y = getY();
            }
        });
    }
}