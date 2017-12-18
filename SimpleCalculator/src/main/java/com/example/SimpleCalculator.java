package com.example;


import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleCalculator {

    private static final Logger logger = Logger.getLogger(SimpleCalculator.class.getName());
    private static boolean debug = false;

    public static void main(String[] args){



        String firstVal = args[0];
        String secondVal = args[1];

        if (debug) {
            logger.log(Level.FINEST, "Adding : " + addNumbers(firstVal, secondVal));
            logger.log(Level.FINEST, "Subtracting : " + subtractNumbers(firstVal, secondVal));
            logger.log(Level.FINEST, "Multiplying : " + multiplyNumbers(firstVal, secondVal));
            logger.log(Level.FINEST, "Dividing : " + divideNumbers(firstVal, secondVal));
        }




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
