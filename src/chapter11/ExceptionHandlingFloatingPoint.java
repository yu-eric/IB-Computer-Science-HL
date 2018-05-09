package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class calculates the sum of all user-entered floating-point values
 */
public class ExceptionHandlingFloatingPoint {

    public static void main(String[] args) {

        ArrayList<Float> userValues = new ArrayList<>();

        float totalSum = 0;
        int wrongCounter = 0;

        while(wrongCounter < 2) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter a set of floating point numbers, or type q to quit: ");

            try {
                if (!in.hasNextFloat()) {

                    if (in.next().equalsIgnoreCase("q")) {
                        System.out.println("Quitting the program");
                        wrongCounter = 5;
                    } else {
                        wrongCounter++;
                        throw new IllegalArgumentException();
                    }
                }

                else {
                userValues.add(in.nextFloat());
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Not a number.");

            }
        }
        System.out.print("Sum of all floating point values: ");
        for(Float i :userValues) {
            totalSum += i;
        }
        System.out.print(totalSum);
    }
}
