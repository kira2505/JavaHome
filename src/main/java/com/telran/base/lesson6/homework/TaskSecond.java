package com.telran.base.lesson6.homework;

import java.util.Scanner;

public class TaskSecond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please input your second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Please input your third number: ");
        int num3 = scanner.nextInt();

        System.out.println("The biggest of your numbers : " + getMaxNumber(num1, num2, num3));

        scanner.close();
    }

    public static int getMaxNumber (int num1, int num2, int num3) {
        int max = num1;
        if (num2 > num1 && num2 > num3) {
            max =  num2;
        } else if (num3 > num1 && num3 > num2) {
            max = num3;
        }
        return max;
    }
}