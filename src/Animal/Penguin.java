package Animal;

public final class Penguin extends Mammal {

    public Penguin(int weight, String color, int age) {
        super(weight, color, age);
    }

    public String move() {
        return "swim in the water and waddle on land";
    }

    public String eat() {
        return "eat fish from the ocean";
    }
}
