package org.example;

public class Main {
    public static void main(String[] args) {
        //example for /r escape sequence
        String message = "Hello, World!\rToday is a sunny day.";
        System.out.println(message);

        //example for printf
        System.out.printf("%s%n%s%n", "Hello, World!", "Today is a sunny day.");

    }
}