package com.telran.base.lesson4;

/**
 * Метод - это кусочек кода который можно вызывать
 * сколько угодно раз!!!
 * Методы позволяют переиспользовать один и тот же код!
 */

public class MethodCallExampleTwo {

    public static void main(String[] args) {
        printNumber(10);
        printNumber(5);

        printSum(10, 20);

    }

    //2 - Метод принимает параметры и ничего не возвращает
    public static void printNumber(int number) { //int number = 5;
        //20 строк кода тут
        System.out.println("Our number is " + number);
    }

    public static void printSum(int a, int b) {
        System.out.println("Sum is = " + (a + b));
    }
}
