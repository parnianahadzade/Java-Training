package org.example.chapter3.exercises;

public class TabularOutput {
    public static void main(String[] args) {
        int counter = 1;
        System.out.println("N\tN2\tN3\tN4");
        while (counter <= 5) {
            System.out.println(counter + "\t" + counter*counter + "\t" + counter*counter*counter + "\t"
                    + counter*counter*counter*counter);

            counter++;
        }
    }
}
