package org.example.chapter3.ecercises;

public class Exercise16 {
    public static void main(String[] args) {
        int x = -2;
        int total = 0;

        while (x <= 10) {
            int y = x + 2;
            x++;
            total += y;

        }
        System.out.println("total = " + total);
    }
}
