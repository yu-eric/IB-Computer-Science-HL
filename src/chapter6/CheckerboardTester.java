package chapter6;

import javax.swing.*;

/**
 * Tester for the Checkerboard class
 */
public class CheckerboardTester {

    public static void main(String[] args) {

        Checkerboard board = new Checkerboard();
        board.setSize(400,420);
        board.setTitle("Checkerboard");
        board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board.setVisible(true);
    }
}
