package org.example.chapter3.exercises;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("To add new customer info enter any integer or enter -1 to exit :");
        int sentinel = input.nextInt();

        while (sentinel != -1) {
            System.out.print("Enter accountNumber :");
            int accountNumber = input.nextInt();

            System.out.print("Enter beginningBalance :");
            int beginningBalance = input.nextInt();

            System.out.print("Enter charges :");
            int charges = input.nextInt();

            System.out.print("Enter credits :");
            int credits = input.nextInt();

            System.out.print("Enter creditLimit :");
            int creditLimit = input.nextInt();

            int balance = beginningBalance + charges - credits;

            System.out.printf("Account Number : %d , Balance %d%n", accountNumber, balance);
            if (balance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            System.out.println("To add new customer info enter any integer or enter -1 to exit :");
            sentinel = input.nextInt();

        }
    }
}
