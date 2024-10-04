package com.revature.models;

//This Class will model a Food object
public class Food {

    public String name;
    public boolean isCookie;

    //all-args constructor: right click -> generate -> constructor -> [choose every variable]
    public Food(String name, boolean isCookie) {
        this.name = name;
        this.isCookie = isCookie;
    }
}
