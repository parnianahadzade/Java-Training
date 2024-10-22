package org.example.chapter4;

public class Example1 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 2; i <= 20; i+=2) {
            total += i;
        }

        System.out.println("Total is " + total);
    }
}
