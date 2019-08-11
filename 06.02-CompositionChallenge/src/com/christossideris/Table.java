package com.christossideris;

public class Table {

    private String style;
    private int legs;
    private int height;

    public Table(String style, int legs, int height) {
        this.style = style;
        this.legs = legs;
        this.height = height;
    }

    public void make(){
        System.out.println("Table --> Making");
    }

    public String getStyle() {
        return style;
    }

    public int getLegs() {
        return legs;
    }

    public int getHeight() {
        return height;
    }
}
