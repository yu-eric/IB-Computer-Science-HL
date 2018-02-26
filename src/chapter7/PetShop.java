package chapter7;

import java.util.ArrayList;

public class PetShop {

    private double totalItemCost = 0;
    private double totalPetCost = 0;
    ArrayList<Double> itemList = new ArrayList<>();
    ArrayList<Double> petList = new ArrayList<>();

    /**
     * Adds the price of an item to the invoice
     * @param price the price of the item
     */
    public void addItem(double price) {
        itemList.add(price);
    }

    /**
     * Gets the total cost of all the items
     * @return the total cost of all items
     */
    public double getItemCost() {
        for(int i = 0; i < itemList.size() - 1; i++) {
            totalItemCost += itemList.get(i);
        }
        return totalItemCost;
    }

    /**
     * Gets a discount of 20%
     * @return total amount discounted by 20%
     */
    public double getDiscount() {
        return getItemCost() * 0.8;
    }

    /**
     * adds the price of a pet to the pet invoice
     * @param price the price of the pet
     */
    public void addPet(double price) {
        petList.add(price);
    }

    /**
     * Gets the total cost of all pets
     * @return the total cost of all pets
     */
    public double getPetCost() {
        for(int i = 0; i < petList.size() - 1; i++) {
            totalPetCost += petList.get(i);
        }
        return totalPetCost;
    }
}
