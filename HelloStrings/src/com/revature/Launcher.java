package com.revature;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("================(String Immutability)");

        //Strings are immutable - we can't change a String once we've defined it.
        String s = "I AM IMMUTABLE";

        s.toLowerCase(); //the method IS happening, but it's not actually changing the String
        System.out.println(s.toLowerCase());
        System.out.println(s);

        //We CAN, however, assign or reassign String variables to new values
        String s2 = s.toLowerCase();
        System.out.println("Old String: " + s);
        System.out.println("New String: " + s2);

        //BUT BEN... if we change the value of s, isn't that changing the String?
        s = "Now I'm a different String!";

        //So yes, s has been reassigned to a new value...
        //but the original "I AM IMMUTABLE" String is still bumping around in Java memory (until garbage collection)

        System.out.println("=========================(String Equality)");

        //we can compare primitives with ==, but not objects
        int i = 5;
        //System.out.println(i == 5);

        //Strings as are objects, and objects must be compared with .equals()
        String st = "Hello Java"; //this is a String literal (no "new" keyword)
        String st2 = "Hello Java"; //another String literal with the same value

        //These two Strings^ are technically the same object in memory as well!
        //This is a feature of using String literals

        //by using the "new" keyword, we will ALWAYS create a new object in memory
        String st3 = new String("Hello Java");

        System.out.println(st == st2); //true - they are the same object in memory, and == compares memory address
        System.out.println(st == st3); //false - they are different objects in memory, since we used "new" for st3

        System.out.println(st.equals(st3)); //true - .equals() compared VALUES of objects, not memory addresses

        System.out.println("===============================(String Methods)");

        //a pangram to use some String methods on (a pangram is a sentence that uses every letter of the alphabet)
        String pangram = "How vexingly quick daft zebras jump!";

        //we can use the length() method to return an int value for the amount of chars in the String
        System.out.println("The pangram is " + pangram.length() + " chars long");

        //we can use subString() to return a portion of the String (based on index)
        System.out.println(pangram.substring(10));
        System.out.println(pangram.substring(5, 25));

        //we can use contains() to check if a String contains a certain substring
        if(pangram.contains("zebra")){
            System.out.println("The pangram has something to do with zebras");
        }

        //we can use split() to break up a String into an array of Strings based on a certain delimiter
        String[] words = pangram.split(" ");

        System.out.println(words); //if we try to print a non-string, we just get a memory address (until we learn about toString())

        //let's use an enhanced for loop to print out the values of this Array
        for(String word : words){
            System.out.println(word);
        }

        //charAt() returns the character at a certain index
        System.out.println("The char at index 5 is: " + pangram.charAt(5));

        //charAt() is often used in conjunction with length() to reverse Strings (in interviews that is)
        String str = "Hello, World!";
        String reversed = "";

        for (int j = str.length() - 1; j >= 0; j--) {
            reversed += str.charAt(j);
        }

        System.out.println(reversed); // This will print "!dlroW ,olleH"

        System.out.println("===============================(StringBuilder Practice Problem Goes Here)");

        //StringBuilder is a Class that behaves like a String, except it's MUTABLE (can be changed)
        StringBuilder sb = new StringBuilder(pangram); //Initialize a StringBuilder with our pangram String

        //reverse
        sb.reverse();

        //append
        sb.append(" BEN WUZ HERE >:D ");

        //insert something else into index 12
        sb.insert(12, "Pepe Silvia");

        //print out the StringBuilder - notice we've changed the actual StringBuilder object! it's ~mutable~
        System.out.println(sb);

        //It's easy to convert a StringBuilder to a String
        String newString = sb.toString();

    }

}
