package org.example.chapter3.ecercises;

public class Exercise7 {


    public static void main(String[] args) {
        int product = 5;
        int x = 5;
        product *= x++;
        System.out.println(product);
        System.out.println(x);
    }
}
