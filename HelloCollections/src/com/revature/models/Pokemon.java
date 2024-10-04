package com.revature.models;

public class Pokemon {

    //These variables are private for the sake of ENCAPSULATION (one of the pillars of OOP)
    //Encapsulation is achieved with private fields and public getters and setters
    private String name;
    private int level;

    //Let's add a method just for spice
    //Based on the pokemon's levels, we can determine if it wins the fight
    public void fight(Pokemon opponent) {
        if(this.level >= opponent.level){
            System.out.println(this.name + " wins the battle!");
        } else {
            System.out.println(this.name + " lost to " + opponent.name);
        }
    }

    //BOILERPLATE CODE---------------------/

    //What is "boilerplate code"?
    //It's any standard block of code this is consistently repeated in multiple places

    //constructors, getters/setters, toString(), equals(), hashcode()

    //no args and all-args constructor
    public Pokemon() {
        this.name = "MissingNo";
        this.level = 0;
    }

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    /* What are getters and setters?

       Combined with private variables, they allow us to achieve ENCAPSULATION
       In a secure app, your Class's variables will always be private
       We cannot change or access private variables without some kind of methods to do so
         -This is where getters and setters come in!

       The point of encapsulation: You don't want data to be exposed or changed on accident
       you want ONE SPECIFIC WAY to view or change the data stored in our variables
       getters and setters with private variables allow only one way to view/change the data */

    //right click -> generate -> getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
