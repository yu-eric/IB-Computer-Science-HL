package Animal;

public class Bird extends Mammal {

    public Bird(int weight, String color, int age) {
        super(weight, color, age);
    }

    public String move() {
      return "fly around with their wings" ;
    }

    public String eat(){
        return "eat seeds and worms";
    }

}
