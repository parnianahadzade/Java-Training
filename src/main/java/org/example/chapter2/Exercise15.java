package org.example.chapter2;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int firstInt = input.nextInt();

        System.out.print("Enter an integer: ");
        int secondInt = input.nextInt();

        int firstIntSquared = firstInt * firstInt;
        int secondIntSquared = secondInt * secondInt;
        System.out.printf("%s%d%n%s%d%n", "firstIntSquared = " , firstIntSquared, "secondIntSquared = " , secondIntSquared);

        int sumOfBothSquares = firstIntSquared + secondIntSquared;
        System.out.printf("%s%d%n", "sumOfBothSquares = " , sumOfBothSquares);

        int minusOfBothSquares = firstIntSquared - secondIntSquared;
        System.out.printf("%s%d%n", "minusOfBothSquares = " , minusOfBothSquares);
    }
}
