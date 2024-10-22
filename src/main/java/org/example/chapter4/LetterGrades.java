package org.example.chapter4;

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a grade between 1 to 100 or type a string to exit");
        int total = 0;
        int gradeCounter = 0;
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;

        while (input.hasNextInt()) {
                int grade = input.nextInt();
                total += grade;
                gradeCounter++;

                switch (grade / 10) {
                    case 10:
                    case 9:
                        gradeA++;
                        break;
                    case 8:
                        gradeB++;
                        break;
                    case 7:
                        gradeC++;
                        break;
                    case 6:
                        gradeD++;
                        break;
                    default:
                        gradeF++;
                }
        }

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;
            System.out.printf("The Average grade is %.2f \n", average);
            System.out.println("Grade A Count is " + gradeA);
            System.out.println("Grade B Count is " + gradeB);
            System.out.println("Grade C Count is " + gradeC);
            System.out.println("Grade D Count is " + gradeD);
            System.out.println("Grade F Count is " + gradeF);
        }
        else {
            System.out.println("No Grades Found");
        }
    }
}
