package com.revature;

public class ScopeTester {

    //This is a Class scoped (AKA static scoped) primitive. Note "static" non-access modifier
    //It's initialized with the value 10
    public static int int1 = 10;

    //Here's another Class scoped primitive. It's uninitialized.
    public static int int2;

    //This is an Instance scoped primitive. Note the lack of the "static" keyword.
    public int int3 = 5;

}
