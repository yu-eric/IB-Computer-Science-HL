package chapter15;

/**
 * Created by eyu9209 on 5/7/2018.
 */
public class StringFind {
    String text, str;

    public StringFind(String userText, String userString) {
        text = userText;
        str = userString;
    }

    public static boolean find(String text, String str) {
        if(text.substring(0, str.length()).equals(str)) {
            return true;
        } else {
            text = text.substring(1, text.length());
            find(text,str);
        }
    }
}
