package org.example.chapter3.exercises;

public class Exercise14 {
    public static void main(String[] args) {
        int x = 7;
        int y = 3;

        x = y++;
        System.out.println(x);

        x = 7;
        y = 3;
        x = ++y;
        System.out.println(x);
    }
}
