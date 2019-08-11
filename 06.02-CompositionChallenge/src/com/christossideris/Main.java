package com.christossideris;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12,55);
        Table table = new Table("Glass", 4,20);
        TV tv = new TV("Sony", false, 75);

        LivingRoom livingRoom = new LivingRoom("Chris' living room",wall1,wall2,wall3,wall4,ceiling,table,tv);
        livingRoom.makeTable();
        livingRoom.getTv().turnOn();



    }
}
