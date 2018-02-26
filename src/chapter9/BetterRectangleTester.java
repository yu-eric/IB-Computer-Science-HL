package chapter9;

public class BetterRectangleTester {

    public static void main(String[] args) {
        BetterRectangle rectangle = new BetterRectangle(100, 200, 200, 400);
        System.out.println("Perimeter = " + rectangle.getPerimeter());
        System.out.println("Area = " + rectangle.getArea());
    }
}
