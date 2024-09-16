package org.example.chapter2.exercise25To26;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int a = input.nextInt();
        System.out.println("Enter an integer : ");
        int b = input.nextInt();

        if (a*3 % b*2 == 0) {
            System.out.println(a*3 + " is a multiple of " + b*2);
        }else {
            System.out.println(a*3 + " is not a multiple of " + b*2);
        }
    }
}
