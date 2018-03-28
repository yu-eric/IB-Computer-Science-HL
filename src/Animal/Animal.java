package Animal;

public abstract class Animal {
    protected int weight;
    protected String color;
    protected int age;

    public Animal(int weight, String color, int age) {
        this.weight = weight;
        this.color = color;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String move();      //just defining the signature

    public abstract String eat();
}
