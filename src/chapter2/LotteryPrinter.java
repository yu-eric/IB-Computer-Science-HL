package chapter2;

import java.util.Arrays;
import java.util.Collections;

public class LotteryPrinter {

    public static void main(String[] args) {
        // Populating array with numbers 1-50, so to not allow duplicates
        Integer[] rngarr = new Integer[50];
        for(int i = 0; i < 50; i++) {
            rngarr[i] = i + 1;
        }

        // Shuffling array of populated numbers
        Collections.shuffle(Arrays.asList(rngarr));
        System.out.println("Play this combination and get lucky!: ");
        for(int i = 0; i < 6; i++) {
            System.out.print(rngarr[i] + "  ");
        }
    }
}
