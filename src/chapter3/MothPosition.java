package chapter3;

public class MothPosition {

    public static void main(String[] args) {

        Moth moth = new Moth(0);
        moth.moveToLight(10);
        System.out.println("Expected position: 5    Actual position: " + moth.getPosition() + "\n");

        moth.moveToLight(15);
        System.out.println("Expected position: 10   Actual position: " + moth.getPosition() + "\n");

        moth.moveToLight(22);
        System.out.println("Expected position: 18.5   Actual position: " + moth.getPosition() + "\n");
    }
}
