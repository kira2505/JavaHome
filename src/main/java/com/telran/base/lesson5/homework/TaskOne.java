package com.telran.base.lesson5.homework;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your number");
        double n = scanner.nextDouble();
        System.out.println("Please input your number");
        double m = scanner.nextDouble();

        String result = "Number " + n + " closer to number 10!";
        if ((double) 10 - m < (double) 10 - n) {
            result = "Number " + m + " closer to number 10!";
        }

        System.out.println(result);

        scanner.close();
    }
}
