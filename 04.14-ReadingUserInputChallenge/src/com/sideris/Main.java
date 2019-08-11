package com.sideris;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 1;
        while (true) {
            if (counter > 10) {
                break;
            }
            System.out.println("Enter number #" + counter + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                counter++;
                int usersNumber = scanner.nextInt();
                sum += usersNumber;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("The sum of those numbers is " + sum);

        scanner.close();
    }
}

