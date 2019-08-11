package com.christossideris;

public class Main {

    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(30,45));
        System.out.println(greatestCommonDivisor(435,675));
        System.out.println(greatestCommonDivisor(-34,56));
        System.out.println(greatestCommonDivisor(2345,-7536));
        System.out.println(greatestCommonDivisor(456,456));
        System.out.println(greatestCommonDivisor(30,250));
        System.out.println(greatestCommonDivisor(-563,-674));
    }
    public static String greatestCommonDivisor (int firstNumber, int secondNumber){
        if ((firstNumber < 0) || (secondNumber < 0)){
            return "Invalid value";
        }
        int gcd = 1;
        for (int i = gcd; i <= firstNumber && i <= secondNumber; i++){

            if ((firstNumber % i == 0) && (secondNumber % i == 0)){
                gcd = i;
            }
        }
        return "The Greatest Common Divisor of " + firstNumber +
                " and " + secondNumber + " is " + gcd;
    }
}
