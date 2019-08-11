package com.christossideris;

public class Main {

    public static void main(String[] args) {

        GrandVitara grandVitara = new GrandVitara(36);
        grandVitara.accelerate(0);
        grandVitara.steer(38);
        grandVitara.accelerate(16);
        grandVitara.accelerate(60);
        grandVitara.accelerate(-40);
        grandVitara.steer(-18);
    }
}
