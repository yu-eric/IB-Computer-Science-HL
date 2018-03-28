package Animal;

/**
 * Created by eyu9209 on 1/23/2017.
 */
public class Dog extends Mammal {

    public Dog(int weight, String color, int age) {
        super(weight, color, age);
    }

    public String move() {
        return "run after their toys and other people";
    }

    public String eat() {
        return "eat dog food and their own vomit";
    }

}
