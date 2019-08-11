package com.christossideris;

public class Main {

    public static void main(String[] args) {
        System.out.println(numberPalindrome(0));
        System.out.println(numberPalindrome(1));
        System.out.println(numberPalindrome(123));
        System.out.println(numberPalindrome(121));
        System.out.println(numberPalindrome(3456543));
    }
    public static String numberPalindrome (int number){
        if (number < 10){
            return "Invalid value";
        }
        int reverse = 0;
        int palindrome = number;
        while (palindrome != 0){
            int remainder = palindrome % 10;
            reverse = (reverse * 10) + remainder;
            palindrome = palindrome / 10;
        }
        if (number == reverse){
            return "Number " + number + " (= " + reverse + ") is a palindrome number";
        } else
            return "Number " + number + " (!= " + reverse + ") is not a palindrome number";
    }
}
