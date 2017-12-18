package com.example;

public class SimpleCalculator {

    public static void main(String[] args){

        String firstVal = args[0];
        String secondVal = args[1];

        System.err.println("Adding : " + firstVal + " +  " +  secondVal + " = " + (addNumbers(firstVal, secondVal)));
        System.err.println("Subtracting : " + firstVal + " -  " +  secondVal + " = " + (subtractNumbers(firstVal, secondVal)));
        System.err.println("Multiplying : " + firstVal + " *  " +  secondVal + " = " + (multiplyNumbers(firstVal, secondVal)));
        System.err.println("Dividing : " + firstVal + " /  " +  secondVal + " = " + (divideNumbers(firstVal, secondVal)));




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
