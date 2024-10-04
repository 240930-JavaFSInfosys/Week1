package com.revature.models;

/* This is an ABSTRACT CLASS, not the "abstract" non-access modifier. It implements the Vehicle Interface
   So now, this abstract class has access to all of the members of Vehicle

    Abstract Classes are Classes with AT LEAST one abstract method
    What sets them apart from Interfaces, is that they can also have concrete methods

    Why use an Abstract Class over an Interface?
    -If you KNOW you have certain methods that will be the same across all subclasses
    -The child classes will share the same functionality for that method (can still override of course)
    -I usually just use Interfaces in full stack development though */
public abstract class Plane implements Vehicle{

    //Some plane variables - these are less restrictive than Interfaces (no need to be static or final)
    public int numWings;
    public int numTurbines;

    //Abstract plane method - All planes can take off, but not all planes take off the same way
    public abstract void takeOff();

    //Concrete plane method - All planes communicate over the radio the same way (maybe)
    public void communicateOverRadio(){
        System.out.println("uhhhhhhhhhhh welcome aboard everybody we're uhhhhhhhh looking at-");
    }

    //All-args Constructor--/ NOTE: we can't instantiate an Abstract Class, but our subclass will use this
    public Plane(int numWings, int numTurbines) {
        this.numWings = numWings;
        this.numTurbines = numTurbines;
    }


    //We could have @Overridden the goForward() method,
    //but we aren't forced since this is an abstract class
    //We WOULD be forced to @Override if this was a regular concrete Class

}
