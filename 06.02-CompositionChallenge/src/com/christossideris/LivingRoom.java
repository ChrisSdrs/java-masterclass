package com.christossideris;

public class LivingRoom {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Table table;
    private TV tv;


    public LivingRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Table table, TV tv) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.table = table;
        this.tv = tv;
    }

   public TV getTv(){
        return this.tv;
   }

   public void makeTable(){
       System.out.println("Livingroom --> Making table");
       table.make();
   }
}
