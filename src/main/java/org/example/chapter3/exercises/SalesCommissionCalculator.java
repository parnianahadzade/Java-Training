package org.example.chapter3.exercises;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;

        Scanner input = new Scanner(System.in);

        System.out.println("To add new salesperson info enter any integer or enter -1 to exit :");
        int sentinel = input.nextInt();

        while (sentinel != -1) {
            System.out.print("Enter item1 count : ");
            int count1 = input.nextInt();

            System.out.print("Enter item2 count : ");
            int count2 = input.nextInt();

            System.out.print("Enter item3 count : ");
            int count3 = input.nextInt();

            System.out.print("Enter item4 count : ");
            int count4 = input.nextInt();

            double itemSalesAmount = (count1*item1) + (count2*item2) + (count3*item3) + (count4*item4);

            double salesTotalAmount = 200 + (((double) 9 /100)*itemSalesAmount);
            System.out.printf("Sales total amount : %.2f%n", salesTotalAmount);

            System.out.println("To add new salesperson info enter any integer or enter -1 to exit :");
            sentinel = input.nextInt();

        }
    }
}
