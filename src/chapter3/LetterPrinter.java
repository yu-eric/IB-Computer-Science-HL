package chapter3;

public class LetterPrinter {

    public static void main(String[] args) {

        LetterWriter fakeletter = new LetterWriter("Mary", "John");
        fakeletter.addLine("I am sorry we must part.");
        fakeletter.addLine("I wish you all the best.");
        System.out.println(fakeletter.getText());

    }
}
