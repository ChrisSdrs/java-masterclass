package com.christossideris;

public class Main {

    public static void main(String[] args) {
        System.out.println(evenDigitSum(6));
        System.out.println(evenDigitSum(456708235));
        System.out.println(evenDigitSum(85536));
        System.out.println(evenDigitSum(-54464));
        System.out.println(evenDigitSum(453372824));
    }
    public static String evenDigitSum (int number){
        if (number < 10){
            return "Invalid value";
        }
        int check = number;
        int sum = 0;
        while (check > 0){
            int p = check % 10;
            check = check / 10;
           if (p % 2 == 0){
               sum += p;
           } sum += 0;
        }
        return "The sum of even digits of number " + number +
                " is " + sum;
    }
}
