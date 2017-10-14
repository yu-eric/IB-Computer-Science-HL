package chapter2;
import java.lang.StringBuilder;

public class ReverseString {

    public static void main(String[] args) {

        StringBuilder revword = new StringBuilder("supercalifragilisticexpialidocious");
        System.out.println("Expected value: " + "suoicodilaipxecitsiligarfilacrepus");
        System.out.println("Actual Value " + revword.reverse().toString());

    }
}
