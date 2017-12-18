package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexCalculatorTest {

    @Test
    public void testNumbers(){

        SimpleCalculator complex = new SimpleCalculator();
        assertEquals(333333,complex.addNumbers("111111","222222"));
        assertEquals(-111111,complex.subtractNumbers("111111","222222"));
        assertEquals(24642,complex.multiplyNumbers("111","222"));
        assertEquals(100000,complex.divideNumbers("100000","1"));

    }


}
