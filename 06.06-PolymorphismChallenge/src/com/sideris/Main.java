package com.sideris;

public class Main {

    public static void main(String[] args) {
        Audi audi = new Audi();
        Suzuki suzuki = new Suzuki();
        Seat seat = new Seat();
        System.out.println(audi.startEngine());
        System.out.println(suzuki.accelerate());
        System.out.println(seat.brake());
        System.out.println(audi.accelerate());
    }
}