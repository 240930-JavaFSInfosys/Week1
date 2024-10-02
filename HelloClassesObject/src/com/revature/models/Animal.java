package com.revature.models;

//This is a Class meant to MODEL an Animal - Think of it like a blueprint for Animal Objects
//This Class defines all of the attributes (variables) and behaviors (methods) that an Animal can have
public class Animal extends Object{

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
        return sound; //Returns the value of the sound variable (which is a String)
    }

    /* Method Disambiguation

    The methods above are both public, so they're accessible throughout the entire app

    Methods have RETURN TYPES - the type of data a method will return
        -eat() has a void return type, meaning it doesn't return anything
        -makeSound() has a String return type, meaning it will return a String

        -Math.random() returns a double from 0.0 - 1.0

    These methods have no (parameters). So we don't need to supply them any info */


    //no-args constructor and an all-args constructor----------------/

    //no-args constructor. It takes NO ARGuments. Often used to define our own default values
    //If we instantiate a new Animal and give it no arguments, this constructor will be called
    public Animal(){
        this.legs = 0;
        this.age = 1;
        this.sound = "yawn";
    }

    //all-args constructor. It takes ALL available ARGuments for an Animal (every variable)
    //Whatever values are supplied when calling this constructor will be assigned to the appropriate variables
    public Animal(int legs, int age, String sound){
        this.legs = legs;
        this.age = age;
        this.sound = sound;
    }


    //NOTE: If we don't define a constructor, Java will provide a no-args constructor for us with totally default values
    //Once we define a custom constructor, this default no-args constructor goes away


    //TODO: subclass that extends this Animal Class

}
