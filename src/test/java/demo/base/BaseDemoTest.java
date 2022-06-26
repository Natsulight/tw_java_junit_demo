package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_23() {
        BaseDemo baseDemo = new BaseDemo();
        int expectedNumber = 23;
        assertEquals(expectedNumber, baseDemo.sum(11, 12)); // pass
//        assertEquals(expectedNumber, baseDemo.sum(10, 30)); // error
    }

    @Test
    public void should_return_greater_than_0() {
        BaseDemo baseDemo = new BaseDemo();
        assertTrue(baseDemo.sum(10, 20) > 0);
    }
}
