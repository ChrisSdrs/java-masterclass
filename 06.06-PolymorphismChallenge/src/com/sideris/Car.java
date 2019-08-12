package com.sideris;

public class Car {

    private String name;
    private int wheels;
    private boolean engine;
    private int cylinders;
    private int speed = 0;

    public Car(String name, int cylinders) {
        this.name = name;
        this.wheels = 4;
        this.engine = true;
        this.cylinders = cylinders;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
       return "Car -> brake()";
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}