package chapter7;

import java.util.Random;

/**
 * Creates an array with random dice tosses and returns a formatted output
 * marking the longest run
 */
public class DiceRun {

    private int[] numbers;
    private int size;

    public DiceRun(int size) {
        this.size = size;
        numbers = new int[size];
    }

    /**
     * fill the numbers array with random dice tosses
     */
    public void fillArray() {
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(6) + 1;
        }
    }

    public String formatLongest() {
        int longestRun = 0;
        int longestRunStart = -1;
        int currentRunStart = -1;
        boolean inRun = false;

        for(int i = 0; i < numbers.length; i++) {
            if(inRun) {
                if(numbers[i] != numbers[i-1]) {
                    inRun = false;
                    if(i - currentRunStart > longestRun) {
                        longestRun = i - currentRunStart;
                        longestRunStart = currentRunStart;
                    }
                }
            }
            if(!inRun) {
                if(i < numbers.length - 1 && numbers[i] == numbers[i + 1]) {
                    inRun = true;
                    currentRunStart = i;
                }
            }
        }

        if(inRun) {
            if(numbers.length - currentRunStart > longestRun) {
                longestRun = numbers.length - currentRunStart;
                longestRunStart = currentRunStart;
            }
        }

        String result= "";

        for(int i = 0; i < numbers.length; i++) {
            if(i > 0) {
                result += " ";
            }
            if(i == longestRunStart) {
                result += "(";
            }
            result += numbers[i];
            if(i == (longestRunStart + longestRun - 1)) {
                result += ")";
            }
        }
        return result;
    }
}
