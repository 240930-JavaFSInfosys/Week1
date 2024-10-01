package com.revature.models;

//This is a Class meant to MODEL an Animal - Think of it like a blueprint for Animal Objects
//This Class defines all of the attributes (variables) and behaviors (methods) that an Animal can have
public class Animal {

    //These are 3 Animal variables - data that describes an Animal
    public int legs;
    public int age;
    public String sound;


    //This is a method that lets an Animal eat
    public void eat(){
        System.out.println("CRONCH CRONCH CRONCH");
    }

    //This is a method lets an Animal make a sound
    public String makeSound(){
        return sound;
    }

    //TODO: Ben will add a method disambiguation just as a cheat sheet for how methods work

    //TODO: no-args constructor and an all-args constructor

    //TODO: subclass that extends this Animal Class

}
