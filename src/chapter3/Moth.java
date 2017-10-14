package chapter3;

/**
 * This class simulates a moth that moves halfway between its current position and a light source
 */
public class Moth {

    private double initialPosition;

    /**
     * @param initialPosition The position where the moth starts
     */
    public Moth(double initialPosition) {
        this.initialPosition = initialPosition;
    }

    /**
     * @param lightPosition The position of the light
     */
    public void moveToLight(double lightPosition) {
        initialPosition = (initialPosition + lightPosition) * 0.5;
    }

    /**
     * @return The final position of the moth
     */
    public double getPosition() {
        return initialPosition;
    }
}
