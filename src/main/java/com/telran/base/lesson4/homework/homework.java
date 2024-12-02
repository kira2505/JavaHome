package com.telran.base.lesson4.homework;

public class homework {

    public static void main(String[] args) {
        int num1 = 89;
        int num2 = 56;
        int result = calculateSum(num1, num2);
        System.out.println("Sum " + num1 + " and " + num2 + " = " + result);

        int result2 = calculateDiff(num1, num2);
        System.out.println("Difference " + num1 + " and " + num2 + " = " + result2);

        int result3 = calculateProd(num1, num2);
        System.out.println("Product " + num1 + " and " + num2 + " = " + result3);

        double result4 = calculateQuot(num1, num2);
        System.out.println("Quotient " + num1 + " and " + num2 + " = " + result4);
    }

    private static int calculateSum (int numOne, int numTwo) {
        int sum = numOne + numTwo;
        return sum;
    }

    private static int calculateDiff (int numOne, int numTwo) {
        int diff = numOne - numTwo;
        return diff;
    }

    private static int calculateProd (int numOne, int numTwo) {
        int prod = numOne * numTwo;
        return prod;
    }

    private static double calculateQuot (int numOne, int numTwo) {
        double quot = (double) numOne / numTwo;
        return quot;
    }
}
