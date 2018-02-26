package chapter7;

import java.util.Scanner;

public class PetShopTester {

    public static void main(String[] args) {

        PetShop petShop = new PetShop();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the pet shop! Will you be buying any pets today? Y or N");
        if(in.next().equalsIgnoreCase("Y")) {
            System.out.println("How many pets will you be buying?");
            int numPets = in.nextInt();
            for(int i = 0; i < numPets; i++) {
                System.out.printf("What is the price of pet number %d?", i + 1);
                petShop.addPet(in.nextInt());
            }
            System.out.println("How many items will you be buying today?");
            int numItems = in.nextInt();
            for(int i = 0; i < numItems; i++) {
                System.out.printf("What is the price of item number %d?", i + 1);
                 petShop.addItem(in.nextInt());
            }

        } else if(in.next().equalsIgnoreCase("N")) {
            System.out.println("How many items will you be buying today?");
            int numItems = in.nextInt();
            for(int i = 0; i < numItems; i++) {
                System.out.printf("What is the price of item number %d?", i + 1);
                petShop.addItem(in.nextInt());
            }

        } else {
            System.out.println("Sorry, that is not a valid input. Please try again.");
        }

        if(petShop.itemList.size() >= 5 && petShop.petList.size() >= 1) {
            System.out.printf("Since you have bought %d items today, you get a 20 percent discount! " +
                    "Your total comes out to $%.2f.",
                    petShop.itemList.size(), petShop.getDiscount() + petShop.getPetCost());
        } else {
            System.out.printf("Your total comes out to be %.2f.",
                    petShop.getItemCost() + petShop.getPetCost());
        }
    }
}
