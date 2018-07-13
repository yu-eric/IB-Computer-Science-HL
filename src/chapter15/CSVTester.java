package chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("So you want to read CSV from a file or the console? \nType 1 for file with no quotes, 2 for file with quotes, or 3 for console");
        int option = in.nextInt();

        if(option == 1) {
            readFromFile();
        }
        else if(option == 3) {
            readFromConsole();
        }

        else if(option == 2) {
            readFromFileWithQuotes();
        }
    }

    private static void readFromFile() {
        parseFile("C:\\Users\\Eric Yu\\IdeaProjects\\IB-Computer-Science-HL\\src\\chapter15\\Demographic_Statistics_By_Zip_Code.csv");

    }

    private static void readFromFileWithQuotes() {
        parseFile("C:\\Users\\Eric Yu\\IdeaProjects\\IB-Computer-Science-HL\\src\\chapter15\\Demographic_Statistics_By_Zip_Code.csv");
    }

    private static void parseFile(String pathname) {
        File file = new File(pathname);
        CSVReader reader = new CSVReader();
        try(Scanner in = new Scanner(file)) {
            while(in.hasNext()) {
                reader.addRow(in.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Bad file");
        }
        printRow(reader);
    }

    private static void printRow(CSVReader reader) {
        System.out.printf("Number of rows: %d\n", reader.numberOfRows());
        System.out.printf("Number of columns on row 1: %d\n", reader.numberOfFields(1));
        System.out.printf("Third column row 1: %s\n", reader.field(1, 3));
        System.out.printf("Fourth column row 1: %s\n", reader.field(1, 4));
    }

    private static void readFromConsole() {
        Scanner in = new Scanner(System.in);
        prompt();
        boolean done = false;
        CSVReader reader = new CSVReader();
        while(!done) {
            String value = in.nextLine();
            if(value.equalsIgnoreCase("quit")) {
                done = true;
                continue;
            }
            reader.addRow(value);
            prompt();
        }
        printRow(reader);
    }

    private static void prompt() {
        System.out.println("Enter a row of comma separated values or quit to finish");
    }
}
