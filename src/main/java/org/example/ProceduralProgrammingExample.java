package org.example;


public class ProceduralProgrammingExample {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int a = 3;

        int b = 4;

        int addition = add(a,b);
        System.out.println(addition);

        int subtraction = subtract(a,b);
        System.out.println(subtraction);
    }


}
