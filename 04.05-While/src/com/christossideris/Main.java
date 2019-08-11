package com.christossideris;

public class Main {

    public static void main(String[] args) {
//          int count = 1;
//        while(count != 6){
//            count ++;
//            System.out.println("Count value is " + count);
//        }
//        count = 1;


//        do {
//            System.out.println("Count value is " + count);
//            count ++;
//
//            if (count > 100){
//                break;
//            }
//        } while (count != 6);


//        count = 1;
//        while (true){
//            if (count == 6){
//                break;
//            }
//            count ++;
//            System.out.println("Count value is " + count);
//        }

        // exercise


        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            } else
                System.out.println("Even number " + number);
            count ++;
            if (count == 5){
                System.out.println("Count = " + count);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else return false;
    }
}
