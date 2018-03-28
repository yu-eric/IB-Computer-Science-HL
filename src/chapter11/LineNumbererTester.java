package chapter11;

import java.io.FileNotFoundException;

public class LineNumbererTester {

    public static void main(String[] args) throws FileNotFoundException, java.io.IOException{

        LineNumberer lineNumberer = new LineNumberer();
        try {
            lineNumberer.numberFileLines("/Users/eric.j.yu/IdeaProjects/IB Computer Science HL/src/chapter11/fireandice.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (java.io.IOException e) {
            System.out.println("ERRORSSS");
        }
    }
}
