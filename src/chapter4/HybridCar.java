package chapter4;

import java.util.Scanner;

public class HybridCar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Enter the price of a new car
        System.out.println("Please enter the cost of the new car: ");
        double newCarPrice = in.nextDouble();

        //Enter the price of a used car
        System.out.println("Please enter the cost of the used car: ");
        double usedCarPrice = in.nextDouble();

        //Enter the estimated miles driven
        System.out.println("Please enter the estimated miles driven per year: ");
        double milesDriven = in.nextDouble();

        //Enter current gas price
        System.out.println("Please enter the current gas price: ");
        double gasPrice = in.nextDouble();

        //Enter mpg of new car
        System.out.println("Please enter the efficiency in miles per gallon of the new car: ");
        double mpgNewCar = in.nextDouble();

        //Enter mpg of old car
        System.out.println("Please enter the efficiency in miles per gallon of the used car: ");
        double mpgUsedCar = in.nextDouble();

        //Enter estimated resale value of new car after 5 years
        System.out.println("Please enter the estimated resale value after 5 years for the new car: ");
        double resaleValueNewCar = in.nextDouble();

        //Enter estimated resale value of old car after 5 years
        System.out.println("Please enter the estimated resale value after 5 years for the old car: ");
        double resaleValueUsedCar = in.nextDouble();

        //The gas price of a car is the miles driven / the mpg, multiplied by the gas price
        double newCarGasPrice = ((milesDriven * 5) / mpgNewCar) * gasPrice;
        double usedCarGasPrice = ((milesDriven * 5) / mpgUsedCar) * gasPrice;

        //The final price of a car is the purchase price plus gas price, minus the resale value
        double newCarFinalPrice = newCarPrice + newCarGasPrice - resaleValueNewCar;
        double usedCarFinalPrice = usedCarPrice + usedCarGasPrice - resaleValueUsedCar;

        //Tell the user the final prices of their car
        System.out.printf("Over the next five years, the gas price of the new car will be $%.2f, and the final price of keeping the car will be $%.2f", newCarGasPrice, newCarFinalPrice);
        System.out.printf("\nFor the old car, the gas price over five years will be $%.2f, and The final price of keeping the car will be $%.2f", usedCarGasPrice, usedCarFinalPrice);
    }
}
