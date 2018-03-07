package chapter9;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawTriangle implements MouseListener {

    private int pointX, pointY;
    @Override
    public void mouseClicked(MouseEvent e) {
        pointX = e.getX();
        pointY = e.getY();
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
