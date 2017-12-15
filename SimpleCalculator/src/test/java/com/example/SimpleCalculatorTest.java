package com.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SimpleCalculatorTest {

    @Test
    public void testNumbers(){

        SimpleCalculator simple = new SimpleCalculator();
        assertEquals(3,simple.addNumbers("1","2"));

    }


}
