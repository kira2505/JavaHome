package com.telran.base.lesson7.homework;

import java.util.Scanner;

public class TaskSecond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your balance : ");
        int data = scanner.nextInt();

        System.out.println("Number of days : " + calculateDays(data));
    }

    public static int calculateMaxDiv(int data) {
        for (int i = data / 2; i >= 1; i--) {
            if (data % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int calculateDays(int data) {
        int days = 0;
        while (data > 0) {
            data = data - calculateMaxDiv(data);
            days ++;
        } return days;
    }
}
