package com.christossideris;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(36534));
        System.out.println(sumDigits(-534));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(68976));
        System.out.println(sumDigits(987879438));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int lastDigit = number % 10;
        int otherDigits = number / 10;
        int i = 0;

        while (otherDigits >= 10) {
            i += otherDigits % 10;
            otherDigits = otherDigits / 10;
        }
        return lastDigit + i + otherDigits;
    }
}
