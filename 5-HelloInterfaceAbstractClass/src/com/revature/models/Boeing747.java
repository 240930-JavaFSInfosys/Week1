package com.revature.models;

/* Boeing747 extends Plane. Plane implements Vehicle. so this Class has everything from Plane and Vehicle
   in other words, it has INHERITED all the members from Plane and Vehicle

   Since Boeing747 is a CONCRETE Class, it MUST implement the 2 abstract methods it inherited */
public class Boeing747 extends Plane{

    //This method was inherited from Plane
    @Override
    public void takeOff() {
        System.out.println("Increasing Throttle...");
        System.out.println("Lift off!");
    }

    //This method was inherited from Vehicle
    @Override
    public void goForward() {
        System.out.println("Starting Engines...");
        System.out.println("The guy with the light batons is like 'ok you can go now'");
        System.out.println("We rolling!");
    }

    //Notice how we didn't need to @Override the communicateOverRadio() method. It's already implemented!
    //We could have overridden it, but we don't have to

    //TODO: remember the default no-args goes away once we make own constructor
    //TODO: so if we NEED a no-args, we have to recreate it ourselves

    //all-args constructor---
    public Boeing747(int numWings, int numTurbines) {
        super(numWings, numTurbines); //Remember super() calls the parent constructor (the superconst.)
    }
}
