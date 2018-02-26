package chapter9;

public abstract class Animal {
    private String species;
    private boolean living;
    private boolean awake;
    private boolean hungry;

    public Animal(String species, boolean living, boolean awake, boolean hungry) {
        this.species = species;
        this.living = living;
        this.awake = awake;
        this.hungry = hungry;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isLiving() {
        return living;
    }

    public void setLiving(boolean living) {
        this.living = living;
    }

    public boolean isAwake() {
        return awake;
    }

    public void setAwake(boolean awake) {
        this.awake = awake;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    /**
     * How/What the animal eats
     * @return what the animal eats
     */
    public abstract String eat();

    /**
     * How the animla moves
     * @return how the animal moves
     */
    public abstract String move();

    /**
     * How the animal poops
     * @return how the animal poops
     */
    public abstract String poop();

    /**
     * How the animal breathes
     * @return how the animal breahes
     */
    public abstract String breath();
}