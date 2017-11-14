package chapter4;

public class SodaCanTester {

    public static void main(String[] args) {

        SodaCan can = new SodaCan(5, 10);
        System.out.printf("Expected Volume: 392.70 \n" + "Expected Surface Area: 314.16 \n" +
                "Actual Volume: %.2f" + "\nActual Surface Area: %.2f", can.getVolume(), can.getSurfaceArea());
    }
}
