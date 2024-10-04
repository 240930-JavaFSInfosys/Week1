package com.revature;

import com.revature.models.Pokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

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

        System.out.println("===============================(Lists)");

        //ArrayList are a very commonly used implementation of the List Interface
        //QC once asked me (and still loves to ask) the difference between Arrays and ArrayLists
        ArrayList<Pokemon> pokemonList = new ArrayList<>();

        //use the .add() method to add values to an ArrayList
        pokemonList.add(new Pokemon("Mudkip", 12));
        pokemonList.add(new Pokemon("Trubbish", 5));
        pokemonList.add(new Pokemon("Gengar", 32));
        pokemonList.add(new Pokemon("Jolteon", 20));
        pokemonList.add(new Pokemon("Metagross", 56));

        //toString() will be called implicitly in a print statement!
        System.out.println(pokemonList);

        //use the .get() method to select certain values in the ArrayList
        System.out.println("The first pokemon in the List is: " + pokemonList.get(0));
        System.out.println("The first pokemon in the List is: " + pokemonList.get(0).getName());

        //use the .set() method to change values in the ArrayList
        pokemonList.set(0, new Pokemon("Marshtomp", 16));

        System.out.println("~~~The team is getting ready to fight a Cyndaquil!~~~");
        Pokemon cyndaquil = new Pokemon("Cyndaquil", 15);

        //we can use .forEach() method to do some operation FOR EACH value in the List
        //notice the different syntax... "->" is called a lambda
        pokemonList.forEach(pokemon -> pokemon.fight(cyndaquil));

        //We can use .size() to get an int value for the length of the List
        System.out.println("I have " + pokemonList.size() + " Pokemon in my party");

        //We decided Cynadquil is alright after fighting. So he joins the party
        pokemonList.add(cyndaquil);
        System.out.println(pokemonList);

        System.out.println("=================================(Sets)");

        //Instantiate a new HashSet (which is like a general use Set)
        HashSet<Pokemon> pokemonSet = new HashSet<>();

        //.add() some pokemon to the Set
        pokemonSet.add(new Pokemon("Gardevoir", 36));
        pokemonSet.add(new Pokemon("Snorlax", 45));
        pokemonSet.add(new Pokemon("Arcanine", 97));
        pokemonSet.add(new Pokemon("Arcanine", 97));

        //Sets don't allow duplicates...
        System.out.println(pokemonSet);
        //BUT those two "new" Arcanines are two separate objects in memory

        //So let's try using the SAME object in memory
        Pokemon mewtwo = new Pokemon("Mewtwo", 100);
        pokemonSet.add(mewtwo);
        pokemonSet.add(mewtwo);
        System.out.println(pokemonSet);

        //sets don't have indexes! They're unordered
        //System.out.println(pokemonSet.get(0));

        //we CAN use .contains() to check if a value exists in the set
        if(pokemonSet.contains(mewtwo)){
            System.out.println("Mewtwo is in the set!");
        }

        System.out.println("==================================(Queues)");

        //Instantiate a LinkedList - This is a Class that implements List AND Queue
        LinkedList<Pokemon> pokemonQueue = new LinkedList<>();

        pokemonQueue.add(new Pokemon("Gardevoir", 36));
        pokemonQueue.add(new Pokemon("Snorlax", 45));
        pokemonQueue.add(new Pokemon("Arcanine", 97));
        pokemonQueue.add(new Pokemon("Arcanine", 97));

        //.peek() lets us view the first element, and that's it
        System.out.println("There are pokemon in line! The first pokemon in line is: " + pokemonQueue.peek());

        //.poll() lets us view AND remove the first element
        pokemonQueue.poll(); //TODO: we could have printed this out, but we didn't

        System.out.println("Gardevior has left the line thanks to the .poll() method!");

        //Just getting the name this time for fun
        System.out.println("The next pokemon in line is: " + pokemonQueue.peek().getName());

        System.out.println("====================================(Maps)");

        //Instantiate a HashMap to store Pokemon trainers - we'll use Integer as the key, String as the value
        HashMap<Integer, String> trainers = new HashMap<>();

        //use .put() to add values to the HashMap
        trainers.put(1, "Ash");
        trainers.put(2, "Red");
        trainers.put(3, "Giovanni");

        System.out.println("The trainers are: " + trainers);

        //use .get() to get a value from a map's key
        System.out.println("The trainer at key 1 is: " + trainers.get(1));

    }

}
