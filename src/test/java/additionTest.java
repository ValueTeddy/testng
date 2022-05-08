import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class additionTest {

    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void testAdder() {
        assertEquals(3, addition.adder(1,2));

    }
    @Test
    void alwaysOn(){
        System.out.println("This is on");
    }
    @Test (dependsOnMethods = {"alwaysOn"})
    void buttonActiveTest() {
        assertEquals(true, addition.buttonActive("true"));
    }

}