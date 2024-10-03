package com.revature;

import java.io.FileNotFoundException;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("==============(Throwing some Runtime Exceptions, AKA Unchecked Exception)");

        //NOTE: We won't usually throw RuntimeExceptions to crash our app on purpose

        System.out.println("Trying to divide by zero");

        //System.out.println(5/0);
        //Our Java code will still compile, but it will throw an ArithmeticException at RUNTIME (runtime exception)

        System.out.println("Trying to access an index that doesn't exist in an Array");

        int[] numbers = {1,2,3,4,5}; //so this Array has indexes 0-4

        //System.out.println(numbers[5]);
        //our "numbers" array only has indexes 0-4 - ArrayIndexOutOfBoundsException!

        //throw new FileNotFoundException();
        //FileNotFoundException is a CHECKED EXCEPTION, so the compiler won't let us run this code

        //throw new Exception();
        //the top Exception class is a CHECKED EXCEPTION as well

        System.out.println("==========================(Exception Handling)");

        /*One way to handle Exceptions is through TRY/CATCH blocks
         -First, we TRY to execute some code that may or may not throw an Exception
         -Next, we have one or more CATCH blocks that will handle any Exceptions that are thrown
         -Lastly, we can have a FINALLY block that will run at the end no matter what */

        try {
            System.out.println("Try block starting...");
            int x = 10/0; //An ArithmeticException will be thrown here
            System.out.println("Will I run?");
        } catch (NullPointerException e){
            System.out.println("I could have caught a NullPointerException... IF I HAD ONE!");
        } catch (ArithmeticException e){
            System.out.println("I caught an ArithmeticException! Don't divide by zero!");
        } catch (Exception e) {
            System.out.println("I could have caught any type of Exception! It's a good safety net");
        } finally {
            System.out.println("Finally block running... I'll run every time! >:D");
            System.out.println("I'm good for things like closing resources, like a DB connection");
            System.out.println("or any other general terminal functions, like saying goodbye to a user");
        }

        //Rule of thumb for catch block order: Most specific to most general

    }

}
