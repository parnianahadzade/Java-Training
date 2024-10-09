package org.example.chapter3.exercises;

public class Exercise6 {
    //sum of 1 to 10
    public static void main(String[] args) {
        int sum = 0;
        int x = 1;

        while (x <= 10) {
            sum += x;
            x++;
        }
        System.out.println(sum);
    }
}
