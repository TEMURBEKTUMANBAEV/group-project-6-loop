package test.java.com.devxschool;

import static org.junit.Assert.assertEquals;

import main.java.com.devxschool.LeapYearsCount;
import org.junit.Test;

public class LeapYearsCountTest {

    @Test
    public void test1(){
        assertEquals("Wrong answer. Please check your code", 1, LeapYearsCount.countLeapYearsBetweenYears(2020, 2022));
    }

    @Test
    public void test2(){
        assertEquals("Wrong answer. Please check your code", 24, LeapYearsCount.countLeapYearsBetweenYears(1800, 1900));
    }

    @Test
    public void test3(){
        assertEquals("Wrong answer. Please check your code", 11, LeapYearsCount.countLeapYearsBetweenYears(1955, 1999));
    }
}
