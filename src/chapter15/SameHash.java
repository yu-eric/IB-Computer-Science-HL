package chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * This class finds words that have the same hash code, and prints the ones that are greater than 1
 */
public class SameHash {

    /**
     * Finds the same hash code and prints it if it is greater than 1
     * @param args the command-line argument
     * @throws FileNotFoundException if the file to read does not exist
     */
    public static void main(String[] args) throws FileNotFoundException {

        Map<Integer, HashSet<String>> map = new HashMap<>();
        Scanner in = new Scanner(new File("C:\\Users\\Eric Yu\\IdeaProjects\\IB-Computer-Science-HL\\src\\chapter15\\engmix.txt"));

        while (in.hasNext()) {
            String word = in.nextLine();
            int h = word.hashCode();

            if (!map.containsKey(h)) {
                HashSet<String> set = new HashSet<>();
                set.add(word);
                map.put(h, set);
            } else {
                map.get(h).add(word);
            }
        }
        for(int entry : map.keySet()) {
            if(map.get(entry).size() > 1) {
                System.out.println(map.get(entry));
            }

        }
    }
}
