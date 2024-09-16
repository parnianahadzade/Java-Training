package org.example.chapter2.exercise28;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();

        System.out.printf
                ("%s%d%n%s%f%n%s%f%n", "diameter : ", radius*2, "circumference : ", radius*2*Math.PI, "area : ", radius*radius*Math.PI);
    }
}
