package com.telran.base.lesson6.homework;

import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any year:");
        int year = scanner.nextInt();

        String isLeap = "It is not a leap year";

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeap = "It is a leap year";
        }

        System.out.println(isLeap);
    }
}