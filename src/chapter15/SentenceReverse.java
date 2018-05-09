package chapter15;

import java.util.Stack;

public class SentenceReverse {

    public Stack sentenceReverse(Stack sentence) {
        for(int i = 0; i < sentence.size() - 1; i++) {
            System.out.println(sentence.pop().toString());
        }
    }
}
