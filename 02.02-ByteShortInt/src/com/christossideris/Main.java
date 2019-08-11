package com.christossideris;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = myMinValue/2;
        System.out.println("My Total = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("My New Byte Value = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("My New Short Value = " + myNewShortValue);

        // long has a width of 64
        long myLongValue = -9_223_372_036_854_755_808L;
        long myNewLongValue = myLongValue/2;
        System.out.println("My New Long Value = " + myNewLongValue);



        // exercise
        byte csByte = 10;
        short csShort = 20;
        int csInt = 50;
        long csLong = 50_000L + 10L * (csByte + csShort + csInt);
        short shortTotal = (short) (1000 + 10 * (csByte + csShort + csInt));
        System.out.println("csLong = " + csLong);
        System.out.println("shortTotal = " + shortTotal);
    }
}
