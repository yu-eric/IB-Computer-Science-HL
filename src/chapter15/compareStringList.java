package chapter15;

import java.util.Comparator;

/**
 * This class implements the Comparator in order to sort by increasing length
 */
public class compareStringList implements Comparator<String> {

    public int compare(String first, String second) {
        return Integer.compare(first.length(), second.length());
    }
}
