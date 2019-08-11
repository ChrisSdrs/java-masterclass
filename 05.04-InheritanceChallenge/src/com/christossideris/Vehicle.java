package com.christossideris;

import java.sql.SQLOutput;

public class Vehicle {

    private String name;
    private String size;
    public int currentDirection;
    public int currentVelocity;


    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer (int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move (int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity +
                " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void stop(){
        System.out.println("Vehicle.stop() called.");
        currentVelocity = 0;
    }
}
