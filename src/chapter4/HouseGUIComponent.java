package chapter4;

import javax.swing.*;
import java.awt.*;

public class HouseGUIComponent extends JComponent {

    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.drawLine(150, 100, 200, 0);
        g2.drawLine(200, 0, 250, 100);
        g2.drawLine(150, 100, 250, 100);
        g2.drawLine(150,100,150,200);
        g2.drawLine(150,200,250,200);
        g2.drawLine(250,100,250,200);
        g2.drawLine(190,200,190,175);
        g2.drawLine(190,175,210,175);
        g2.drawLine(210,175,210,200);
    }
}

