package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexCalculatorTest {

    @Test
    public void testNumbers(){

        SimpleCalculator complex = new SimpleCalculator();
        assertEquals(3,complex.addNumbers("100092912","292991092"));
        assertEquals(3,complex.subtractNumbers("100092912","292991092"));
        assertEquals(3,complex.multiplyNumbers("100092912","292991092"));
        assertEquals(3,complex.divideNumbers("100092912","292991092"));

    }


}
