package com.christossideris;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer("Z364","HP",167,true);

        printer.print(100);
        System.out.println(" ");
        printer.fillToner(120);
        System.out.println(" ");
        printer.print(10);
        System.out.println(" ");
        printer.print(-10);
        System.out.println(" ");
        printer.print(80);
        System.out.println(" ");
        printer.print(25);
        System.out.println(" ");
        printer.print(15);
    }
}
