package test.java.com.devxschool;

import static org.junit.Assert.assertEquals;

import main.java.com.devxschool.NumberPower;
import org.junit.Test;


public class NumberPowerTest {

    @Test
    public void numberPowerTest1() {
        assertEquals("Wrong calculation. Please check your code", 27, NumberPower.countPowerOfNums(3,3));
    }

    @Test
    public void numberPowerTest2() {
        assertEquals("Wrong calculation. Please check your code", 125, NumberPower.countPowerOfNums(5,3));
    }

    @Test
    public void numberPowerTest3() {
        assertEquals("Wrong calculation. Please check your code", 9, NumberPower.countPowerOfNums(9,1));
    }
}
