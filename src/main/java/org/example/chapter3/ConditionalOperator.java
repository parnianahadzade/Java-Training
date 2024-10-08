package org.example.chapter3;

public class ConditionalOperator {
    public static void main(String[] args) {
        int a = 5;
        double b = 10.5;

        // This will compile because both int and double can be promoted to double
        double result = (a > 10) ? a : b; // This compiles fine

        String strResult = (a > 10) ? String.valueOf(a) : "Hello"; // This will produce a compilation error
        // Type mismatch: cannot convert from int to String
    }
}
