package test.java.com.devxschool;

import main.java.com.devxschool.Presence;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PresenceTest {

    @Test
    public void test1() {
        int[] array = {1,2,3,4,4,4,0};
        assertEquals("Wrong answer. Please check your code", "PRESENT", Presence.checkPresence(array, 4));
    }

    @Test
    public void test2() {
        int[] array = {1,2,3,4,4,4,0};
        assertEquals("Wrong answer. Please check your code", "NOT PRESENT", Presence.checkPresence(array, 5));
    }

    @Test
    public void test3() {
        int[] array = {1,2,3,4,4,4,0};
        assertEquals("Wrong answer. Please check your code", "NOT PRESENT", Presence.checkPresence(array, -1));
    }

    @Test
    public void test4() {
        int[] array = {0,0,0,0,0,0,0,0,0,2};
        assertEquals("Wrong answer. Please check your code", "PRESENT", Presence.checkPresence(array, 2));
    }

}
