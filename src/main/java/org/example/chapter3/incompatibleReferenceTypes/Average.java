package org.example.chapter3.incompatibleReferenceTypes;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        //counter controlled iteration
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
}
