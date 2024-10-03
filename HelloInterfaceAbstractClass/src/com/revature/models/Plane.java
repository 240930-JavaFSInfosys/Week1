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

    //TODO: Some plane variables

    //TODO: abstract plane method

    //TODO: concrete plane method

}
