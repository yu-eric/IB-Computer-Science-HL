package chapter15;

import java.util.Scanner;

public class StringFindTester {

    public static void main(String[] args) {

        StringFind sf = new StringFind();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string that you want to scan: ");
        String text = in.nextLine();
        System.out.println("Please enter the string you want to find: ");
        String str = in.nextLine();

        System.out.println(sf.find(text, str));
    }
}
