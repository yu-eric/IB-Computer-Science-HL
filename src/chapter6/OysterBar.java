package chapter6;
import java.util.Scanner;

/**
 * This class is designed to simulate the entering and leaving of an oyster bar with a maximum occupancy of 100 people
 */
public class OysterBar {

    public static void main(String[] args) {

        final int MAXIMUM_OCCUPANCY = 100;
        int currentOccupancy = 0;
        String enterOrLeave;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Are you entering or leaving the oyster bar? Type enter, leave, or quit. ");
            enterOrLeave = in.nextLine();

            if (enterOrLeave.toString().equalsIgnoreCase("enter")) {
                System.out.println("How many people are entering? ");
                int numEntering = in.nextInt();

                if (currentOccupancy + numEntering <= MAXIMUM_OCCUPANCY) {
                    currentOccupancy += numEntering;
                    System.out.println("The current occupancy is now " + currentOccupancy);

                } else {
                    System.out.println("Sorry, that is not a valid number. Please try again.");
                }
            } else if (enterOrLeave.toString().equalsIgnoreCase("leave")) {
                System.out.println("How many people are leaving? Please enter a negative number.");
                int numLeaving = in.nextInt();

                if (numLeaving < 0 && numLeaving + currentOccupancy >= 0) {
                    currentOccupancy += numLeaving;
                    System.out.println("The current occupancy is now: " + currentOccupancy);

                } else {
                    System.out.println("Sorry, that is not a valid number. Please try again.");
                }
            } else if(enterOrLeave.toString().equalsIgnoreCase("quit")) {
                System.out.println("Thanks for visiting the oyster bar!");
            }
            else {
                System.out.println("Sorry, that input is not recognized. Please try again!");
            }
        }
        while (!enterOrLeave.toString().equalsIgnoreCase("quit"));
    }
}
