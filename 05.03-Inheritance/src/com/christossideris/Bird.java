package com.christossideris;

public class Bird extends Animal {

    private int legs;
    private int wings;
    private int sleep;

    public Bird(String name, int size, int weight, int legs, int wings, int sleep) {
        super(name, 1, 1, size, weight);
        this.legs = legs;
        this.wings = wings;
        this.sleep = sleep;
    }

    public void moveWings(){
    }
    public void fly(int speed){
        moveWings();
        super.move(speed);
    }
}

