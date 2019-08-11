package com.christossideris;

public class Main {

    public static void main(String[] args) {
        System.out.println(firstAndLastDigitSum(2));
        System.out.println(firstAndLastDigitSum(346));
        System.out.println(firstAndLastDigitSum(923457));
        System.out.println(firstAndLastDigitSum(732427));
        System.out.println(firstAndLastDigitSum(46723164));
        System.out.println(firstAndLastDigitSum(17451));
    }
    private static String firstAndLastDigitSum (int number){
        if (number < 10){
            return "Invalid value";
        }
        int last = number % 10;
        int first = 0;
        int check = number;
        while (check > 0){
            first = check % 10;
            check = check / 10;
        }
        if (last == first){
            return "First digit is equal to Last digit " + number;
        } else return "First digit is not equal to last digit " + number;
    }
}
