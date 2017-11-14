package chapter4;

import javax.swing.*;

public class HouseGUIViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("House");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HouseGUIComponent house = new HouseGUIComponent();
        frame.add(house);
        frame.setVisible(true);
    }
}
