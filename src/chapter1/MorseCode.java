package chapter1;
import java.util.Scanner;

public class MorseCode {
    static String[] characters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z"};
    static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----","-.-.--", "--..--", "..--..", ".-.-.-", ".----.",};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter characters only to convert into morse code: ");
        String userInput = in.next();

        for(int i = 0; i < userInput.length(); i ++) {
            char singleLetter = userInput.toLowerCase().charAt(i);

            for(int j = 0; j < characters.length; j++) {
                if(characters[j].equals(Character.toString(singleLetter))) {
                        System.out.println(morse[j]);
                }
            }
        }
    }
}
