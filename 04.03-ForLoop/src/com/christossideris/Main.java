package com.christossideris;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        System.out.println("******************************");

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
        System.out.println("******************************");
        for (int interestRate = 2; interestRate <= 8; interestRate++) {
            System.out.println("10,000 at " + interestRate + "% interest = " + String.format("%.2f", calculateInterest(10000.0, interestRate)));
        }
        System.out.println("******************************");
        for (int interestRate = 8; interestRate >= 2; interestRate--) {
            System.out.println("10,000 at " + interestRate + "% interest = " + String.format("%.2f", calculateInterest(10000.0, interestRate)));
        }

        System.out.println("******************************");

        // exercise

        int count = 0;

        for (int p = 10; p < 100; p++) {
            if (isPrime(p)) {
                System.out.println("Number " + p + " is a prime number");
                count++;
            }
            if (count == 10) {
                System.out.println("Exiting for loop");
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
