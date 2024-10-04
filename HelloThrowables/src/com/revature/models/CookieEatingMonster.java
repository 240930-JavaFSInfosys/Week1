package com.revature.models;

import com.revature.exceptions.NotACookieException;

//This Class will model a monster that only eats cookies. A cookie monster if you will
//It will have two methods that take in a Food object and throw an Exception if it's not a cookie
public class CookieEatingMonster {

    //This method takes in a Food and throws/handles the NotACookieException if it's not a cookie
    public void eatCookieWithTryCatch(Food food){

        try{

            System.out.println("Trying to feed the monster " + food.name);

            if(food.isCookie){
                System.out.println("I LOVE COOKIES NOM NOM NOM >:D");
            } else {
                //"throw" is a keywork used to THROW a new Exception
                throw new NotACookieException("I caught a NotACookieException");
            }
        } catch (NotACookieException e){
            System.out.println("DISGUSTING! I only eat cookies. Try again.");
            e.printStackTrace(); //This is what prints the error message to the console
        } //TODO: We could have had a catch for generic Exception, as well as a finally block

    }

}
