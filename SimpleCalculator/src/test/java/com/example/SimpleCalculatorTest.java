package com.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SimpleCalculatorTest {

    @Test
    public void testNumbers(){

        SimpleCalculator simple = new SimpleCalculator();
        assertEquals(3,simple.addNumbers("1","2"));
        assertEquals(2,simple.subtractNumbers("4","2"));
        assertEquals(1, simple.multiplyNumbers("1","1"));
        assertEquals(4,simple.divideNumbers("8","2"));

    }


}
