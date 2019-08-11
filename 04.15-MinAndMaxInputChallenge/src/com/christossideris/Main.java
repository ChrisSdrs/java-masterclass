package com.christossideris;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while (true){

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                if(first){
                    first = false;
                    max = number;
                    min = number;
                }
                if (number > max){
                    max = number;
                } if (number < min){
                    min = number;
                }
            } else {
                System.out.println("Exiting loop");
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("Max number is " + max + ", min  number is " + min);

        scanner.close();
    }
}
