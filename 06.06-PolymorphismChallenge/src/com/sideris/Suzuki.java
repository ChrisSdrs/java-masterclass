package com.sideris;

public class Suzuki extends Car {
    public Suzuki() {
        super("Suzuki", 6);
    }

    @Override
    public String accelerate(){
        return "Suzuki -> accelerate()";
    }

    @Override
    public String brake() {
        return "Suzuki -> break()";
    }

    @Override
    public String startEngine() {
        return "Suzuki -> startEngine()";
    }
}