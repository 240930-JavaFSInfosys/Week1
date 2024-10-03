package com.revature;

import org.w3c.dom.ls.LSOutput;

public class Launcher {

    public static void main(String[] args) {

        //Since int1 and int2 are STATIC, we can call them directly from the ScopeTester Class
        //We don't need to instantiate a ScopeTester, since these variables "belong to the Class"
        System.out.println(ScopeTester.int1);
        System.out.println(ScopeTester.int2);

        //Java doesn't like this. int3 is nonstatic, so we need to instantiate a ScopeTester object
        //System.out.println(ScopeTester.int3);

        //Instantiate a ScopeTester object
        ScopeTester tester = new ScopeTester();

        //Now, we can access int3! Through an INSTANCE of ScopeTester (non statics are called "instance" scoped)
        System.out.println(tester.int3);

        System.out.println(tester.int1); //and yes, we can still access statics through an object

        System.out.println("====================================(Manipulating ScopeTester Variables)");

        //Instantiate a second ScopeTester
        ScopeTester tester2 = new ScopeTester();

        //Above, we printed out all 3 variables from the first ScopeTester. Now let's print them from tester2
        System.out.println(tester2.int1);
        System.out.println(tester2.int2);
        System.out.println(tester2.int3);

        //Let's change these in tester 2
        tester2.int1 = 100;
        tester2.int2 = 200;
        tester2.int3 = 300;

        //Let's print out the variables from both tester1 and tester2
        System.out.println("Tester 1: " + tester.int1);
        System.out.println("Tester 2: " + tester2.int1);

        //int2 - same story - both values change since int2 is static
        System.out.println("Tester 1: " + tester.int2);
        System.out.println("Tester 2: " + tester2.int2);

        //int3 - a nonstatic variable - so its value ONLY changes in the object we changed it in
        System.out.println("Tester 1: " + tester.int3);
        System.out.println("Tester 2: " + tester2.int3);

        //let's see another example of a changing nonstatic only affecting the object it was changed in
        tester2.message = "I am the new message";
        System.out.println(tester.message);
        System.out.println(tester2.message);

        //for every static variable, the most recently changed value will be shared amongst every instance (object)
        //for every NONstatic variable, only the object that had its value changed will have the new value

        System.out.println("===================================(Method/Block Scope)");

        //This won't work, can't call nonstatic members in static methods
        //nonStaticMethod();

        //Not typically advised to make a Launcher object inside the Launcher class, but this is for science
        Launcher launcher = new Launcher();
        launcher.nonStaticMethod();

        ScopeTester.staticMethod();
        //ScopeTester.nonstaticMethod(); won't work! We would need an object first
        tester.nonstaticMethod(); //this will work, since we're going through an instance to access the method.

    } //end of main method

    public static void scopesExampleMethod(int x){

        //this variable is METHOD SCOPED. only visible within the method it's defined in.
        int methodScopedVariable = 10;

        //NOTE: method parameters are also method scoped (int x is method scoped).

        if(true){
            //this variable is BLOCK SCOPED. only visible within the block it's defined in.
            int blockScopedVariable = 20;

            //we can access all of the variables defined within this method from here
            System.out.println(methodScopedVariable);
            System.out.println(x);
            System.out.println(blockScopedVariable);
        }

        //Java won't like this - we're trying to access a variable outside of its scope
        //System.out.println(blockScopedVariable);

    }

    public void nonStaticMethod(){
        System.out.println("Hi, I'm nonstatic, so I can't run in the STATIC main method on my own");
    }

}
