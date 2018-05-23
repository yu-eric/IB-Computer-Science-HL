package chapter15;

/**
 * Created by eyu9209 on 5/7/2018.
 */
public class StringFind {

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