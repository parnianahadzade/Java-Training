package org.example.chapter3.incompatibleReferenceTypes;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        //counter controlled iteration
//        counterControlledIteration();

        //sentinel controlled iteration
        sentinelControlledIteration();

        
    }

    public static void counterControlledIteration() {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 1;
        while (count <= 5) {
            System.out.print("Enter your grade: ");
            int grade = input.nextInt();
            total = total + grade;
            count = count + 1;
        }

        double average = (double) total / count;
        System.out.println("The average is " + average);
    }

    public static void sentinelControlledIteration() {
        int total = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade or -1 to exit: ");
        int grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
            count = count + 1;

            System.out.println("Enter your grade or -1 to exit: ");
            grade = input.nextInt();
        }

        if (count != 0) {
            double average = (double) total / count;
            System.out.println("The count is " + count);
            System.out.println("The average is " + average);
            System.out.printf("The average is %.2f", average);
        }else {
            System.out.println("No grades were entered.");
        }


    }
}
