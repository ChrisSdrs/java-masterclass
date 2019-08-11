package com.christossideris;

public class Main {

    public static void main(String[] args) {

        // char has a width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;



        // exercise

        char csChar = '\u00AE';
        System.out.println("Cs Unicode output was: " + csChar);
        char anotherChar = '\u0152';
        System.out.println("Another Unicode output was: " + anotherChar);
    }
}
