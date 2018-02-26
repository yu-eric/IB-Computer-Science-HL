package chapter6;

import java.util.Scanner;

public class FactorPrinter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find its factors: ");
        FactorGenerator factor = new FactorGenerator(in.nextInt());
        factor.nextFactor();
    }
}
