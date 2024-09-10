package org.example.chapter2;

import java.util.Scanner;

public class Exercise5 {

    //calculating the product of 3 integers


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int x = input.nextInt();
        System.out.println("Enter second integer: ");
        int y = input.nextInt();
        System.out.println("Enter third integer: ");
        int z = input.nextInt();

        int result = x + y + z;
        System.out.printf("%s%d%n", "Product is ", result);


    }
}
