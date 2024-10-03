package com.revature;

import com.revature.models.Boeing747;
import com.revature.models.Plane;
import com.revature.models.Vehicle;

public class Launcher {

    public static void main(String[] args) {

        /*Remember, we can't instantiate Interfaces or Abstract Classes
        Vehicle v = new Vehicle(); //BAD
        Plane p = new Plane(2, 4); //NO */

        Boeing747 b = new Boeing747(2, 4);

        //call some methods
        b.communicateOverRadio(); //this came from the Plane Abstract Class
        b.goForward(); //this came from the Vehicle Interface, implemented by Plane, and then Boeing747
        b.takeOff(); //this came from the Plane Abstract Class

        //use some variables
        System.out.println("Boeing747 has " + b.numWings + " wings... that's good");
        System.out.println("Boeing747 has " + b.numTurbines + " turbines... that's also good");

    }

}
