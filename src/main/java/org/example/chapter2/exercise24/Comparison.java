package org.example.chapter2.exercise24;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = input.nextInt();
        System.out.print("Enter an integer: ");
        int b = input.nextInt();
        System.out.print("Enter an integer: ");
        int c = input.nextInt();
        System.out.print("Enter an integer: ");
        int d = input.nextInt();
        System.out.print("Enter an integer: ");
        int e = input.nextInt();

        int smallest = a;
        if (smallest > b) {
            smallest = b;
        }
        if (smallest > c) {
            smallest = c;
        }
        if (smallest > d) {
            smallest = d;
        }
        if (smallest > e) {
            smallest = e;
        }
        System.out.println("The smallest number is " + smallest);

        int largest = a;
        if (largest < b) {
            largest = b;
        }
        if (largest < c) {
            largest = c;
        }
        if (largest < d) {
            largest = d;
        }
        if (largest < e) {
            largest = e;
        }

        System.out.println("The largest number is " + largest);
    }
}
