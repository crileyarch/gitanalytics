package com.example;


import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleCalculator {

    private static final Logger logger = Logger.getLogger(SimpleCalculator.class.getName());

    public static void main(String[] args){



        String firstVal = args[0];
        String secondVal = args[1];

        logger.log(Level.SEVERE, "Adding : " + firstVal + " +  " +  secondVal + " = " + (addNumbers(firstVal, secondVal)));
        logger.log(Level.SEVERE,"Subtracting : " + firstVal + " -  " +  secondVal + " = " + (subtractNumbers(firstVal, secondVal)));
        logger.log(Level.SEVERE,"Multiplying : " + firstVal + " *  " +  secondVal + " = " + (multiplyNumbers(firstVal, secondVal)));
        logger.log(Level.SEVERE,"Dividing : " + firstVal + " /  " +  secondVal + " = " + (divideNumbers(firstVal, secondVal)));




    }

    public static int addNumbers(String firstVal, String secondVal){


        return new Integer(firstVal) + new Integer(secondVal);

    }

    public static int subtractNumbers(String firstVal, String secondVal){


        return new Integer(firstVal) - new Integer(secondVal);

    }

    public static int multiplyNumbers(String firstVal, String secondVal){


        return new Integer(firstVal) * new Integer(secondVal);

    }

    public static int divideNumbers(String firstVal, String secondVal){


        return new Integer(firstVal) / new Integer(secondVal);

    }


}
