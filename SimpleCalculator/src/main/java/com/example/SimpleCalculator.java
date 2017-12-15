package com.example;

public class SimpleCalculator {

    public static void main(String[] args){

        String firstVal = args[0];
        String secondVal = args[1];

        System.out.println("Adding : " + firstVal + " +  " +  secondVal + " = " + (addNumbers(firstVal, secondVal)));
        System.out.println("Subtracting : " + firstVal + " -  " +  secondVal + " = " + (subtractNumbers(firstVal, secondVal)));
        System.out.println("Multiplying : " + firstVal + " *  " +  secondVal + " = " + (multiplyNumbers(firstVal, secondVal)));
        System.out.println("Dividing : " + firstVal + " /  " +  secondVal + " = " + (divideNumbers(firstVal, secondVal)));




    }

    public static int addNumbers(String firstVal, String secondVal){


        int result = new Integer(firstVal) + new Integer(secondVal);

        return result;
    }

    public static int subtractNumbers(String firstVal, String secondVal){


        int result = new Integer(firstVal) - new Integer(secondVal);

        return result;
    }

    public static int multiplyNumbers(String firstVal, String secondVal){


        int result = new Integer(firstVal) * new Integer(secondVal);

        return result;
    }

    public static int divideNumbers(String firstVal, String secondVal){


        int result = new Integer(firstVal) / new Integer(secondVal);

        return result;
    }


}
