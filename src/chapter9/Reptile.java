package chapter9;

public class Reptile extends Animal {

    private boolean livesOnLand;
    private int length;
    private boolean isCarnivore;
    /**
     * Constructor for Mammal class that inherits from Animal class.
     * @param species AsianInvasion.Mammal species
     * @param living Is the mammal alive?
     * @param awake Is the mammal awake?
     * @param hungry Is the mammal hungry?
     */
    public Reptile(String species, boolean living, boolean awake, boolean hungry) {
        super(species, living, awake, hungry);
    }

    /**
     * Checks if reptile lives on land.
     * @return Whether the reptile lives on land.
     */
    public boolean livesOnLand(){
        return livesOnLand;
    }

    /**
     * Checks the length of the reptile.
     * @return The reptile's length.
     */
    public int Length(){
        return length;
    }

    /**
     * Checks of the reptile is a carnivore.
     * @return Whether it is a carnivore.
     */
    public boolean isCarnivore(){
        return isCarnivore;
    }

    /**
     * How the animal eats.
     * @return How the animal eats.
     */
    public String eat() {
        return "I use my teeth to grab and eat small invertebrates and mammals.";
    }

    /**
     * How the animal moves.
     * @return How the animal moves.
     */
    public String move() { return "I use my legs to crawl or use my body to slither on the ground"; }

    /**
     * How the animal defecates.
     * @return How the animal defecates.
     */
    public String poop() { return "Snakes expel this feces through their anal scale that is called Cloaca. Others expel both solid and liquid waste through the same opening.";}

    /**
     * How the animal breathes.
     * @return How the animal breathes.
     */
    public String breath() { return "I breathe through my lungs using my skin.";}

}
