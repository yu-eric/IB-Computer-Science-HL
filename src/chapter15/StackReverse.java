package chapter15;

import java.util.Scanner;
import java.util.Stack;

/**
 * This class takes the sentence input of a user and reverses it, word by word
 */

public class StackReverse {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a sentence to reverse, ending with a period: ");
        String next = in.nextLine();
        String[] sentence = next.split("\\. ");
        Stack<String> words = new Stack<>();
        String[] wordList = new String[] {};
        boolean space = true;

        for(int i = 0; i < sentence.length; i++) {
            wordList = sentence[i].split(" ");

            wordList[0] = wordList[0].toLowerCase();
            wordList[0] += ".";
            if(i == sentence.length - 1) {
                wordList[sentence.length - 1] = wordList[sentence.length - 1].substring(0, wordList[sentence.length - 1].length() - 1);

            }
            for(int j = 0; j < wordList.length; j++) {
                int theIndex = wordList.length - 1;

                if(!(wordList[j]).equals(". ")) {
                    wordList[j] += " ";
                }
                if(j == theIndex) {
                    // Capitalizes the first letter
                    wordList[theIndex] = wordList[theIndex].replace(wordList[theIndex].charAt(0), wordList[theIndex].toUpperCase().charAt(0));
                }
                words.push(wordList[j]);

            }
        }

        while(!words.isEmpty()) {
            System.out.print(words.pop());
        }
    }
}
