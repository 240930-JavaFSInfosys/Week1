package com.revature.exceptions;

/*This Class extends Exception. This makes it a Checked Exception (AKA Compile Time Exception)
  So now, this Class has all the basic functionalities of the Exception (can crash code, give the user a stack trace)
  If we wanted an UNCHECKED (AKA runtime) Exception, we could have extended RuntimeException instead */
public class NotACookieException extends Exception {

    //Most of the time, our custom exception just need one constructor
    //This constructor will take in a message to tell the user, and a call to super();
    public NotACookieException(String message) {
        super(message);
    }
}
