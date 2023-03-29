package test.java.com.devxschool;

import main.java.com.devxschool.Pattern;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PatternTest {
    
    @Test
    public void buildTextTest1(){
        String actual = Pattern.buildText("java", "&", 2);
        assertEquals("The user entered word: 'java', separator: '&', times: 2", "java&java", actual);
    }
    @Test
    public void buildTextTest2(){
        String actual = Pattern.buildText("&", "java", 2);
        assertEquals("The user entered word: '&', separator: 'java', times: 2", "&java&", actual);
    }
    @Test
    public void buildTextTest3(){
        String actual = Pattern.buildText("java", "&", 1);
        assertEquals("The user entered word: 'java', separator: '&', times: 1", "java", actual);
    }
    @Test
    public void buildTextTest4(){
        String actual = Pattern.buildText("Teddy", "Bear", 10);
        assertEquals("The user entered word: 'Teddy', separator: 'Bear', times: 10",
                "TeddyBearTeddyBearTeddyBearTeddyBearTeddyBearTeddyBearTeddyBearTeddyBearTeddyBearTeddy", actual);
    }
}
