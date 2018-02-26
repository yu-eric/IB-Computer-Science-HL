package chapter7;

import java.util.Scanner;

public class UnitConverterTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.printf("Enter what you want to convert from: %s, %s, %s, %s, %s, %s, %s",
                UnitConverter.FL_OZ, UnitConverter.GAL, UnitConverter.OZ, UnitConverter.LB,
                UnitConverter.IN, UnitConverter.FT, UnitConverter.MI);
        String from = "";
        if(in.hasNextLine()) {
            from = in.nextLine();
        } else {
            System.out.println("Bad conversion value");
            System.exit(0);
        }

        System.out.printf("Enter what you want to convert to: %s, %s, %s, %s, %s, %s, %s, %s",
                UnitConverter.ML, UnitConverter.L, UnitConverter.G, UnitConverter.KG,
                UnitConverter.MM, UnitConverter.CM,
                UnitConverter.M, UnitConverter.KM);

        String to = "";
        if(in.hasNextLine()) {
            to = in.nextLine();
        } else {
            System.out.println("Bad conversion value");
            System.exit(0);
        }

        System.out.println("What amount do you want to convert?");
        double amount = 0;
        if(in.hasNextDouble()) {
            amount = in.nextDouble();
            if(amount < 0) {
                System.out.println("Cannot be negative");
                System.exit(0);
            }
        } else {
            System.out.println("Must enter a number");
            System.exit(0);
        }

        UnitConverter unitConverter = new UnitConverter(from, to, amount);
        System.out.printf("Convert from? %s Convert to? %s Amount? %.2f %s = %.2f %s",
                from, to, amount, from, unitConverter.convert(), to);

    }
}
