package chapter6;

import java.util.Random;

/**
 * This class simulates running a monty hall problem, and finding if switching or staying with your selection is better
 */
public class MontyHall {

    Random random = new Random();
    int stayWin;

    /**
     * Calculates number of wins if staying with pick
     * @return number of wins by staying
     */
    public int getStayWins() {
        for (int i = 0; i < 1000; i++) {
            int[] doors = {0, 0, 0};
            doors[random.nextInt(3)] = 1;
            int pick = doors[random.nextInt(3)];

            // Checks if door opened is picked or correct
            int doorShown = random.nextInt(3);
            while (doors[doorShown] != 0) {
                doorShown = random.nextInt(3);
            }
            // Calculating score
            stayWin += doors[pick];
        }
        return stayWin;
    }
}
