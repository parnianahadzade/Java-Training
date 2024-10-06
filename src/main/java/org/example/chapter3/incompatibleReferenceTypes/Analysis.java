package org.example.chapter3.incompatibleReferenceTypes;

import java.util.Scanner;

public class Analysis {
    //nested control statements

    public static void main(String[] args) {
        int studentCount = 1;
        int passes = 0;
        int fails = 0;

        Scanner scanner = new Scanner(System.in);

        while (studentCount <= 5) {
            System.out.println("Enter 1 if passed, 2 if failed: ");
            int grade = scanner.nextInt();

            if (grade == 1) {
                passes = passes + 1;
            }else {
                fails = fails + 1;
            }

            studentCount = studentCount + 1;

        }

        System.out.printf("Passed : %d%nFailed : %d%n", passes, fails);

        if (passes > 3) {
            System.out.println("Bonus to instructor.");
        }
    }
}
