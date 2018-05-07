package chapter15;

import java.util.Scanner;
import java.util.Stack;

/**
 * This class takes the sentence input of a user and reverses it, word by word
 */

public class StackReverse {

    public static void main(String[] args) {

        Stack<String> sentence = new Stack<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a sentence to reverse, ending with a period, question mark, or exclamation mark: ");
        boolean noPunctuation = true;

        while(noPunctuation) {
            String word = in.next();
            sentence.push(word);
            if(word.contains(".") || word.contains("?") || word.contains("!")) {
                noPunctuation = false;
            }
        }

        while(!sentence.isEmpty()) {
            System.out.print(sentence.pop() + " ");
        }
    }
}
