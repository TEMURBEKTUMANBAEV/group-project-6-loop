package test.java.com.devxschool;

import org.junit.Assert;
import org.junit.Test;
import main.java.com.devxschool.Factorial;

public class FactorialTest {

    @Test
    public void calculateTest1() {
        Assert.assertEquals(120, Factorial.calculate(5));
    }

    @Test
    public void calculateTest2() {
        Assert.assertEquals(24, Factorial.calculate(4));
    }

    @Test
    public void calculateTest3() {
        Assert.assertEquals(1, Factorial.calculate(1));
    }
}