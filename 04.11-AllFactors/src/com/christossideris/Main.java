package com.christossideris;

public class Main {

    public static void main(String[] args) {
        allFactors(50);
        System.out.println("********");
        allFactors(5433);
        System.out.println("********");
        allFactors(0);
        System.out.println("********");
        allFactors(-103);
        System.out.println("********");
        allFactors(103);
    }
    private static String allFactors (int number){
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                int check = number % i;
                if (check == 0) {
                    System.out.format(" %d  ", i);
                }
            }
        }
        return "Invalid value";
    }
}
