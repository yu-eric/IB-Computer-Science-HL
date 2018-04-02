package chapter9;

import javax.swing.*;

public class RandomShapeTester {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        final int WIDTH = 400;
        final int HEIGHT = 400;

        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RandomShapeComponent component = new RandomShapeComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
