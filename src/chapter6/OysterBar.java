package chapter6;
/**
 * This class is designed to simulate the entering and leaving of an oyster bar with a maximum occupancy of 100 people
 */
public class OysterBar {

    final int MAXIMUM_OCCUPANCY = 100;
    int currentOccupancy = 0;
    String enterOrLeave;

    /**
     * Calculates if a party can enter the bar, and adds them to the occypancy if they can
     * @param numEntering number of people entering the oyster bar
     */
    public void peopleEntering(int numEntering) {

    if (currentOccupancy + numEntering <= MAXIMUM_OCCUPANCY) {
        currentOccupancy += numEntering;
        System.out.println("The current occupancy is now " + currentOccupancy);

    } else {
        System.out.println("Sorry, that is not a valid number. Please try again.");
        }
    }

    /**
     * Calculates number of people attempting to leave, and subtracts that number from the current occupancy
     * @param numLeaving the number of people attempting to leave
     */
    public void peopleLeaving(int numLeaving) {
        if (numLeaving < 0 && numLeaving + currentOccupancy >= 0) {
            currentOccupancy += numLeaving;
            System.out.println("The current occupancy is now: " + currentOccupancy);

        } else {
            System.out.println("Sorry, that is not a valid number. Please try again.");
        }
    }
}