package com.revature;

public class Calculator {

    /* A better calculator would have more than just add and divide...
    But this demo is mainly for examples of:

    1) Unit testing with JUnit
    2) Logging with Logback */

    public int add(int x, int y){
        return x + y;
    }

    public double divide(double x, double y){

        if(y == 0){
            //TODO: log
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        return (x / y);
    }

}
