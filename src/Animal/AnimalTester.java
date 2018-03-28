package Animal;

/**
 * Created by eyu9209 on 1/23/2017.
 */
public class AnimalTester {

    public static void main(String[] args) {
        Penguin myPenguin = new Penguin(30, "Black & White", 2);
        Bird bird = new Bird(1, "Brown", 1);
        Dog dog = new Dog(30, "Golden", 1);
        Frog frog = new Frog(1, "Green", 3);
        System.out.println("Penguins " + myPenguin.eat());
        System.out.println("Birds " + bird.eat());
        System.out.println("Dogs " + dog.eat());
        System.out.println("Frogs " + frog.eat());
        System.out.println("");
        System.out.println("Penguins " + myPenguin.move());
        System.out.println("Birds " + bird.move());
        System.out.println("Dogs " + dog.move());
        System.out.println("Frogs " + frog.move());
    }
}
