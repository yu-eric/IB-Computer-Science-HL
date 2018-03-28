package chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class LineNumberer {

    public void numberFileLines (String fileName) throws FileNotFoundException, java.io.IOException{

        try {
            File file = new File(fileName);
            Scanner in = new Scanner(file);
            PrintWriter numberedFile = new PrintWriter("/Users/eric.j.yu/IdeaProjects/IB Computer Science HL/src/chapter11/NumberedFile.txt");

            int i = 0;
            while (in.hasNextLine()) {
                numberedFile.println("/* " + i + " */" + in.nextLine());
                i++;
            }
        } catch (FileNotFoundException e) {
            out.println("The file does not exist.");
        }
        try {
            in.close();
            out.close();
        } catch (java.io.IOException e) {
            System.out.println("ERROR");
        }
    }
}
