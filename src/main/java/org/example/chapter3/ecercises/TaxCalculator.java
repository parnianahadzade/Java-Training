package org.example.chapter3.ecercises;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (count < 3) {
            System.out.print("Enter name : ");
            String name = input.next();

            System.out.print("Enter amount : ");
            double amount = input.nextDouble();

            double tax;
            if (amount <= 30000) {
                tax = amount * (15 / 100.0);
            }else {
                tax = amount * (20 / 100.0);
            }
            System.out.printf("Name: %s Tax: %.2f%n", name, tax);
            System.out.println();

            count++;
        }
    }
}
