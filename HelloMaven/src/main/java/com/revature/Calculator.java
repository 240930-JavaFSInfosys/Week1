package com.revature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    /* A better calculator would have more than just add and divide...
    But this demo is mainly for examples of:

    1) Unit testing with JUnit
    2) Logging with Logback */

    //To use Logback, we need to instantiate a Logger object
    //The Logger will come from the org.slf4j package
    private static final Logger log = LoggerFactory.getLogger(Calculator.class);

    public int add(int x, int y){
        log.info("Adding {} and {}", x, y); //This is a general informational log (hence "info")
        return x + y;
    }

    public double divide(double x, double y){

        if(y == 0){
            log.warn("User tried to divide by zero! Maybe stop them on the front end before it gets here!");
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        log.info("Dividing {} by {}", x, y);
        return (x / y);
    }

}
