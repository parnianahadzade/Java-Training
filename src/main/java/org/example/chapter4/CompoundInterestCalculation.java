package org.example.chapter4;

public class CompoundInterestCalculation {
    public static void main(String[] args) {
        double principle = 1000;
        double rate = 0.05;
        System.out.printf("%s%20s%n","Year","Amount on Deposit");

        double x = 1 + rate;

        for (int n = 1; n <= 10; n++) {
            double amount = principle * Math.pow(x, n);
            System.out.printf("%4d%,20.2f%n",n,amount);
        }
    }
}
