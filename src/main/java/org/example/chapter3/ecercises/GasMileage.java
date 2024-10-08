package org.example.chapter3.ecercises;

import java.util.Scanner;

public class GasMileage {
    //pseudocode
    // 1) input miles driven and gallons used for each trip (int)
    // 2) calculate and display miles per gallon for each trip : miles/gallons
    // 3) miles per gallon for all trips up to this point

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tripCount = 0;
        double totalMilesPerGallon = 0;

        System.out.println("To add new trip info enter any integer or enter -1 to exit :");
        int sentinel = input.nextInt();

        while (sentinel != -1) {
            System.out.println("Enter milesDriven : ");
            int milesDriven = input.nextInt();
            System.out.println("Enter gallons : ");
            int gallons = input.nextInt();

            double milesPerGallon = (double) milesDriven / gallons;
            System.out.printf("The milesPerGallon is %.2f%n", milesPerGallon);

            totalMilesPerGallon += milesPerGallon;
            tripCount++;

            System.out.println("To add new trip info enter any integer or enter -1 to exit :");
            sentinel = input.nextInt();

        }

        if (tripCount != 0) {
            double averageMilesPerGallon = totalMilesPerGallon / tripCount;
            System.out.printf("The averageMilesPerGallon is %.2f%n", averageMilesPerGallon);
        }
        else {
            System.out.println("No milesDriven found");
        }
    }
}
