package org.example;


import java.util.Scanner;

public class UniCodeExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //uni code for letter
        int uniCodeForA = scanner.nextInt();

        char aChar = (char) uniCodeForA;

        System.out.println(aChar);



    }
}
