package org.example.chapter3.exercises;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        System.out.print("Enter an integer : ");
        int firstLargest = input.nextInt();

        System.out.print("Enter an integer : ");
        int secondLargest = input.nextInt();

        if (secondLargest > firstLargest) {
            //swap
            int temp = firstLargest;
            firstLargest = secondLargest;
            secondLargest = temp;
        }

        while (count <= 3) {
            System.out.print("Enter an integer : ");
            int number = input.nextInt();
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest && number != firstLargest) {
                secondLargest = number;
            }
            count++;
        }
        System.out.println("The first largest number is " + firstLargest);
        System.out.println("The second largest number is " + secondLargest);
    }
}
