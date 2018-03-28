package Animal;

/**
 * Created by eyu9209 on 3/9/2018.
 */
public class Frog extends Reptile {

    public Frog(int weight, String color, int age) {
        super(weight, color, age);
    }

    public String move() {
        return "hop around";
    }

    public String eat() {
        return "use their long tongue to stick insects";
    }
}
