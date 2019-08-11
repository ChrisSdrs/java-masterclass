package com.christossideris;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here.";
    }
}
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lot of people.";
    }
}

public class Main {

    public static void main(String[] args) {



    }
}
