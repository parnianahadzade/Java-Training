package org.example.chapter2.exercise25To26;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = input.nextInt();

        if (a % 3 == 0) {
            System.out.println("Divisible by 3!");
        }else {
            System.out.println("not divisible by 3!");
        }
    }
}
