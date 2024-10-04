package com.revature;

import com.revature.models.Pokemon;

public class Launcher {

    public static void main(String[] args) {

        //before we do anything with collections let's use getters/setters
        Pokemon testPoke = new Pokemon("Pikachu", 10);

        //we can't access or change the private variables without getters/setters!
//        testPoke.name;
//        testPoke.level = 11;

        System.out.println("My pokemon is " + testPoke.getName());
        testPoke.setLevel(11);
        //we can also chain methods together
        testPoke.setLevel((testPoke.getLevel() + 1)); //imagine the Pokemon leveled up



    }

}
