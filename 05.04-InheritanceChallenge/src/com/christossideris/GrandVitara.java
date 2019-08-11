package com.christossideris;

public class GrandVitara extends Car {
    private int roadServiceMonths;

    public GrandVitara(int roadServiceMonths) {
        super("GrandVitara", "4WD", 4, 3, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate (int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 15){
            changeGear(1);
        } else if (newVelocity > 15 && newVelocity <= 35){
            changeGear(2);
        } else if (newVelocity > 35 && newVelocity <= 70){
            changeGear(3);
        } else if (newVelocity > 70 && newVelocity <= 100){
            changeGear(4);
        } else {
            changeGear(5);
        }
        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

}
