package org.example.chapter2.exercise18To23And27;

public class Asterisk {

    public static void main(String[] args) {
//        Asterisk.box();
//
//        Asterisk.oval();
//
//        Asterisk.arrow();
//
//        Asterisk.diamond();

//        Asterisk.check();

//        Asterisk.checkBoard();


    }

    public static void box() {
        int rows = 5;
        int columns = 10;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || i == rows - 1  || j == 0 || j == columns - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void oval() {
        System.out.println("  ***  ");
        System.out.println(" *   * ");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" *   * ");
        System.out.println("  ***  ");
    }

    public static void arrow() {
        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
    }

    public static void diamond() {
        System.out.println("    *    ");
        System.out.println("   * *   ");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        System.out.println("*       *");
        System.out.println(" *     * ");
        System.out.println("  *   *  ");
        System.out.println("   * *   ");
        System.out.println("    *    ");
    }

    public static void check() {
//        System.out.println("*");
//        System.out.println("***");
//        System.out.println("*****");
//        System.out.println("****");
//        System.out.println("**");


//        System.out.print("*");
//        System.out.print("***");
//        System.out.print("*****");
//        System.out.print("****");
//        System.out.print("**");

//        System.out.print("*");
//        System.out.println("***");
//        System.out.println("*****");
//        System.out.print("****");
//        System.out.println("**");

//        System.out.printf("  ****%n *****%n*******%n ******%n ****%n");

    }

    public static void checkBoard() {
        System.out.println("* * * * * * * *");
        System.out.println(" * * * * * * * *");
        System.out.println("* * * * * * * *");
        System.out.println(" * * * * * * * *");
        System.out.println("* * * * * * * *");
        System.out.println(" * * * * * * * *");
        System.out.println("* * * * * * * *");
        System.out.println(" * * * * * * * *");
    }
}
