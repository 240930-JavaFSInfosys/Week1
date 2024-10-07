//Tests Classes are just typical Java Classes, but it's the METHODS that are special

import com.revature.Calculator;
import org.junit.Test;

import static org.junit.Assert.*; //now we have access to all assertions in one line


public class CalculatorTests {

    //Instantiate a Calculator object
    Calculator calc = new Calculator();

    //TODO: beforeEach and beforeAll

    //positive test for add()
    @Test
    public void testAdd(){

        int result = calc.add(5, 10);
        assertEquals(result, 15);

    }

    //another positive test for add()
    @Test
    public void testAddNegatives(){

        int result = calc.add(-20, -40);

        //there are other assertions we can use besides assertEquals
        assertEquals(result, -60);
        assertNotEquals(result, 60); //make sure that the add() method can handle the negative signs appropriately

        //It's fine to have multiple assertions in one test method!

    }

    //positive test for divide()
    @Test
    public void testDivide(){
        double result = calc.divide(15, 2);
        assertTrue(result == 7.5);
        assertFalse(result == 7); //make sure divide() doesn't round down

    }

    //negative test for divide() - remember negative tests test what happens when something goes wrong
    @Test
    public void testDivideByZero(){

        //"assert that an IllegalArgumentException gets thrown when we try to divide by zero"
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }



}
