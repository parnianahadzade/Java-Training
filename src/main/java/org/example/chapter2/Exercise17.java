package org.example.chapter2;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int firstInt = input.nextInt();

        System.out.print("Enter an integer: ");
        int secondInt = input.nextInt();

        System.out.print("Enter an integer: ");
        int thirdInt = input.nextInt();

        int sum = firstInt + secondInt + thirdInt;
        System.out.println("The sum is: " + sum);

        int average = sum / 3;
        System.out.println("The average is: " + average);

        int product = firstInt * secondInt * thirdInt;
        System.out.println("The product is: " + product);

        //using class math for comparing
        int smallestInt = Math.min(Math.min(firstInt, secondInt), thirdInt);
        System.out.println("The smallest int is: " + smallestInt);

        int largestInt = Math.max(Math.max(firstInt, secondInt), thirdInt);
        System.out.println("The largest int is: " + largestInt);
    }
}
