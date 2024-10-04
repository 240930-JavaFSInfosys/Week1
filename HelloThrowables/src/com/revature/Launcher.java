package com.revature;

import com.revature.exceptions.NotACookieException;
import com.revature.models.CookieEatingMonster;
import com.revature.models.Food;

import java.io.FileNotFoundException;

public class Launcher {

    //main will try to throw NotACookieException when encountered... but there's nowhere to throw it
    //so your code will just crash! There should always be a try/catch at the end of a throws chain
    //It's common for a method to throw an Exception, but there should be a try/catch somewhere.
    public static void main(String[] args) throws NotACookieException {

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

        System.out.println("============================(Using our Custom Checked Exception)");

        //Let's make some Food objects and a CookieEatingMonster
        Food food1 = new Food("Steak", false);
        Food food2 = new Food("White Chocolate Macadamia", true);
        CookieEatingMonster monster = new CookieEatingMonster();

        //Let's try to feed the monster!
        monster.eatCookieWithTryCatch(food1); //This will throw and catch an exception, then printStackTrace

        System.out.println("We just printed the stack trace from the caught exception! We didn't crash");

        monster.eatCookieWithTryCatch(food2); //no problem, cause we gave him a cookie

        //now, we'll use the eatCookieWithThrows method instead

        //we could wrap this in a try/catch, but we're going to put the "throws" on main now
        monster.eatCookieWithThrows(food2); //all good! monster got a cookie

        //the compiler will allow us to run this, since we said main throws NotACookieException
        //but...it still crashes. see the comments at the top of main to see why
        monster.eatCookieWithThrows(food1);

    }

}
