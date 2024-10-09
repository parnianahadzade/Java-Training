package org.example.chapter3.exercises;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;

        System.out.print("Enter an integer : ");
        int largest = input.nextInt();

        while (count < 5) {

            System.out.print("Enter an integer : ");
            int number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            count++;
        }

        System.out.println("The largest number is " + largest);
    }
}
