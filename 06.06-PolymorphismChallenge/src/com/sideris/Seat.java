package com.sideris;

public class Seat extends Car {
    public Seat() {
        super("Seat", 7);
    }

    @Override
    public String accelerate(){
        return "Seat -> accelerate()";
    }

    @Override
    public String brake() {
        return "Seat -> brake()";
    }

    @Override
    public String startEngine() {
        return "Seat -> startEngine()";
    }
}