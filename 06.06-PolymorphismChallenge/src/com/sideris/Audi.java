package com.sideris;

public class Audi extends Car {
    public Audi() {
        super("Audi", 8);
    }

    @Override
    public String accelerate(){
        return "Audi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Audi -> brake()";
    }

    @Override
    public String startEngine() {
        return "Audi -> startEngine()";
    }
}