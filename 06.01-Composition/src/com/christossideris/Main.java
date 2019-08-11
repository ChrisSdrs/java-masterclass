package com.christossideris;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Dimensions myCaseDimensions = new Dimensions(45,40,15);
        Case myCase = new Case("P400 S", "Phanteks",
                "650W", myCaseDimensions);

        Monitor myMonitor = new Monitor("AGON 27","AOC",
                27, new Resolution(1920,1080));
        Motherboard myMotherboard = new Motherboard("Gaming Pro Carbon",
                "MSI", 4, 2, "v2.44");

        PC myPC = new PC(myCase, myMonitor, myMotherboard);

        //myPC.getTheCase().pressPowerButton();
        //myPC.getMonitor().drawPixelAt(1500,1200,"red");
        //myPC.getMotherboard().loadProgram("Windows 10");
        myPC.powerUp();
    }
}
