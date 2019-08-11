package com.christossideris;

public class TV {

    private String model;
    private boolean power;
    private int globRating;

    public TV(String model, boolean power, int globRating) {
        this.model = model;
        this.power = power;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("TV --> Turning on");
    }

    public String getModel() {
        return model;
    }

    public boolean isPower() {
        return power;
    }

    public int getGlobRating() {
        return globRating;
    }
}
