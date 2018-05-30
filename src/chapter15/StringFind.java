package chapter15;

/**
 * This class tests recursively if a given string exists in another string
 */
public class StringFind {

    /**
     * Finds a string in another larger string
     * @param text text to be found
     * @param str the larger string
     * @return true if the string is found, false otherwise
     */
    public boolean find(String text, String str) {

        if (text.length() < str.length()) {
            return false;
        } else if (text.substring(0, str.length()).equals(str)) {
            return true;
        } else {
            text = text.substring(1);
            return find(text, str);
        }
    }
}