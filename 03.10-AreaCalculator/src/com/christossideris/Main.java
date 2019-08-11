package com.christossideris;

public class Main {

    public static void main(String[] args) {
        // height is a vertical line connecting the small base with the large base
        System.out.println(areaCalculator(15,15,130));
    }
    public static String areaCalculator(double largeBase, double smallBase, double height){
        if ((largeBase < 0.0) || (smallBase < 0.0) || (height < 0.0)){
            return "Invalid Value";
        }
        double emvadon = ((largeBase + smallBase) * height) / 2;
        double stremmata = emvadon / 1000;
        return "This land is " + stremmata + " stremmata, or " + emvadon + " m^2.";
    }
}
