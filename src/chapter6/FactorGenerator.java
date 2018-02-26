package chapter6;

/**
 * The purpose of this class is to find all factors of a given integer
 */
public class FactorGenerator {

    private int inputNum;

    /**
     * Constructor
     * @param numberToFactor the integer that will be factored
     */
    public FactorGenerator(int numberToFactor) {
        this.inputNum = numberToFactor;
    }

    /**
     * Factors the given integer
     */
    public void nextFactor() {

        int factorNum = 1;
        System.out.println("These are all the factors of " + inputNum + ":");

        while(factorNum < inputNum) {

            if(inputNum % factorNum == 0) {
                System.out.println(factorNum);
            }
            factorNum ++;
        }
    }
}
