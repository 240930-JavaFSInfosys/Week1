package com.revature;

import com.revature.models.Animal;
import com.revature.models.Dog;

public class Launcher {

    public static void main(String[] args) {

        //Instantiate an Animal object with the no-args constructor
        //This will give us a generic Animal object with generic values
        Animal a = new Animal();

        //let's use some Animal variables
        System.out.println("Our animal has " + a.legs + " legs"); // 0 legs is no way to live

        //we can assign new values to our object's variables
        a.legs = 12;
        System.out.println("Now our animal has " + a.legs + " legs");

        //let's invoke the 2 animal methods
        a.eat();

        //since makeSound() returns a String, we need to print it out to see anything
        System.out.println(a.makeSound());

        //OK let's instantiate 2 new Animals using out all-args constructor
        Animal a2 = new Animal(4, 2, "woof");
        Animal a3 = new Animal(2, 5, "oo oo aa aa");

        //use makeNoise() methods just for fun
        System.out.println(a2.makeSound());
        System.out.println(a3.makeSound());

        System.out.println("=============================(Use our new Dog subclass)");

        //Instantiate a Dog object with the no-args constructor
        Dog d = new Dog();

        //let's use some dog methods
        d.eat(); //notice how this eat() method is different from the Animal eat() method
        d.fetch("ball");

        //Using the all-args constructor now
        Dog d2 = new Dog(4, 5, "AWOOOOOO", "foxhound");
        Dog d3 = new Dog(4, 8, "bark", "terrier");

        //let's use some variables and methods -
        System.out.println(d2.breed + " says " + d2.makeSound());
        System.out.println(d3.breed + " says " + d3.makeSound());

    }

}
