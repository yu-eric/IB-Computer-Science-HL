package chapter2;

public class DieSimulator {

    public static void main(String[] args) {

        int die1;
        int die2;

        int rollCounter = 0;

        do {
            // Generating a random number for each die
            die1 = (int) Math.ceil(Math.random() * 6);
            die2 = (int) Math.ceil(Math.random() * 6);
            rollCounter++;
            System.out.println("Roll " + rollCounter + ": " + die1 + "  " + die2);
        } while (die1 != 1 || die2 != 1);

        System.out.println("It took " + rollCounter + " tries to get snake eyes.");
    }
}
