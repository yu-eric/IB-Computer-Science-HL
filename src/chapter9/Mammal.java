package chapter9;

/**
 * Created by eyu9209 on 1/29/2018.
 */
public class Mammal extends Animal {

    private boolean hasLegs;
    private int weight;
    private boolean hasOpposableThumbs;
    private boolean canSpeak;

    /**
     * Constructor for Mammal class that inherits from Animal class.
     * @param species Mammal species
     * @param living Is the mammal alive?
     * @param awake Is the mammal awake?
     * @param hungry Is the mammal hungry?
     */
    public Mammal(String species, boolean living, boolean awake, boolean hungry) {
        super(species, living, awake, hungry);
    }

    /**
     * Outputs if mammal has legs.
     * @return Does the mammal have legs?
     */
    public boolean hasLegs() {
        return hasLegs;
    }

    /**
     * Outputs weight of mammal.
     * @return Weight of mammal.
     */
    public int weight() {
        return weight;
    }

    /**
     * Outputs if the animal has opposable thumbs.
     * @return Does the animal have opposable thumbs?
     */
    public boolean hasOpposableThumbs() { return hasOpposableThumbs; }

    /**
     * Outputs if the animal can speak.
     * @return Can the animal speak?
     */
    public boolean canSpeak() {
        return canSpeak;
    }

    /**
     * What the animal says about its eating.
     * @return A string of text.
     */
    public String eat() {
        return "I use my jaws to help chew my food or drink milk!";
    }

    /**
     * What the animal says about its moving.
     * @return A string of text.
     */
    public String move() { return "I am running and swimming around."; }

    /**
     * What the animal says about its defecating.
     * @return A string of text.
     */
    public String poop() { return "Why do you care about when I poop?";}

    /**
     * What the animal says about its breathing.
     * @return A string of text.
     */
    public String breath() { return "I am breathing, don't worry.";}


}
