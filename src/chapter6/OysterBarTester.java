package chapter6;

import java.util.Scanner;

/**
 * Tester class for the OysterBar class
 */
public class OysterBarTester {

    public static void main(String[] args) {
    String enterOrLeave;
    OysterBar oyster = new OysterBar();

    do {
        Scanner in = new Scanner(System.in);
        System.out.println("Are you entering or leaving the oyster bar? Type enter, leave, or quit. ");
        enterOrLeave = in.nextLine();


        if (enterOrLeave.toString().equalsIgnoreCase("enter")) {
            System.out.println("How many people are entering? ");
            int numEntering = in.nextInt();
            oyster.peopleEntering(numEntering);


        } else if (enterOrLeave.toString().equalsIgnoreCase("leave")) {
            System.out.println("How many people are leaving? Please enter a negative number.");
            int numLeaving = in.nextInt();
            oyster.peopleLeaving(numLeaving);

        } else if (enterOrLeave.toString().equalsIgnoreCase("quit")) {
            System.out.println("Thanks for visiting the oyster bar!");
        }

        else {
            System.out.println("Sorry, that input is not recognized. Please try again!");
        }

        } while (!enterOrLeave.equalsIgnoreCase("quit")) ;
    }
}
