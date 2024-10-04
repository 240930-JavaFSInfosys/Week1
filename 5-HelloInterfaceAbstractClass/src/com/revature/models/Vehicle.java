package com.revature.models;

/* This is an INTERFACE, which can contain variables and ABSTRACT METHODS!
   Interfaces are meant to be IMPLEMENTED by Classes, which give functionality to all the abstract methods
   The reason Interfaces are "contracts" is because any subclass MUST implement the abstract methods

   Interfaces are great for organization. Imagine we had 500 methods
   would you rather refer to the abstract methods, or have to scroll through all 500 concrete methods? */
public interface Vehicle {

    //Variables in an Interface are public static final by default
    boolean hasSeats = true; //not super descriptive or useful...

    //Abstract Method - no method body (not implemented). public abstract by default
    void goForward();

    /* Every Vehicle should be able to go forward. However, not every Vehicle will go forward the same way
       The role of an Interface is to lay out the IDEAS of behaviors, but not the implementations
       "how to go forward" is up to each implementing class (Car, Boat, Plane) */

}
