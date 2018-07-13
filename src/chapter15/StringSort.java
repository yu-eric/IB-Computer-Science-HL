package chapter15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * This class sorts a list of strings by increasing length, then by lexicographical order
 */
public class StringSort {

    /**
     * Sorts the unsorted list of strings
     * @param al the unsorted list of strings
     * @return a sorted list of strings
     */
    public ArrayList<String> sort(ArrayList<String> al) {
        Collections.sort(al, new compareStringList());
        return al;
    }
}

