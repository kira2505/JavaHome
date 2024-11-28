package com.telran.base.lesson4;

public class MethodCallExampleFour {

    public static void main(String[] args) {
        int one = 34;
        int two = 22;
        int result = calculateSum(one, two); //calculateSum(34,22)
        System.out.println("Sum " + one + " and " + two + " = " + result);
    }

    private static int calculateSum(int numberOne, int numberTwo) { //numberOne = 34, numberTwo = 22
        int sum = numberOne + numberTwo;
        return sum;
    }
}
