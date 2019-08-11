package com.christossideris;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
        int switchValue = 6;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It was 3, or 4, or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, 5");
                break;
        }


        // exercise


        char switchChar = 'G';
        switch (switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChar + " was found");
                break;
            default :
                System.out.println("Could not find A, B, C, D, E");
                break;
        }

        String month = "Jusadasne";
        switch (month) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default :
                System.out.println("Not sure");
                break;
        }


    }
}
