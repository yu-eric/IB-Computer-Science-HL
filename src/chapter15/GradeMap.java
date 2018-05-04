package chapter15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * This program helps to store grades, allowing the user to access and change them
 */
public class GradeMap {

    public static void main(String[] args) {
        Map<String, String> gradeMap = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
        boolean done = true;
        String studentName, studentGrade;

        while (done) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter a to add a student, r to remove a student, m to modify grades, " +
                    "v to view all grades, or q to quit: ");
            String input = in.nextLine();

            if (input.equalsIgnoreCase("a")) {

                System.out.println("Enter the name of the student: ");
                studentName = in.nextLine();
                System.out.println("Enter the grade of the student: ");
                studentGrade = in.next();
                gradeMap.put(studentName, studentGrade);

            } else if (input.equalsIgnoreCase("r")) {
                System.out.println("Please enter the name of the student you want to remove: ");
                String studentKey = in.nextLine();
                if (gradeMap.containsKey(studentKey)) {
                    gradeMap.remove(studentKey);
                } else {
                    System.out.println("Sorry, that student does not exist.");
                }

            } else if (input.equalsIgnoreCase("m")) {
                System.out.println("Enter the name of the student whose grade you want to change: ");
                String studentKey = in.nextLine();
                if (gradeMap.containsKey(studentKey)) {
                    System.out.println("What do you want to change their grade to? ");
                    gradeMap.replace(studentKey, in.nextLine());
                } else {
                    System.out.println("Sorry, that student does not exist.");
                }

            } else if (input.equalsIgnoreCase("v")) {
                for (Map.Entry<String, String> map : gradeMap.entrySet()) {
                    String student = map.getKey();
                    String grade = map.getValue();
                    System.out.println(student + " has a grade of " + grade);
                }
            }

            else if (input.equalsIgnoreCase("q")) {
                System.out.println("Thanks for using the grader!");
                done = false;
            }
            else {
                System.out.println("Sorry, input not recognized. Please try again.");
            }

        }
    }

}
