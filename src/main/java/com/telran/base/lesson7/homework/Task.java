package com.telran.base.lesson7.homework;

import java.util.Random;

public class Task {

    public static void main(String[] args) {
        Random random = new Random();
        int temperature1 = random.nextInt();
        int temperature2 = random.nextInt();
        System.out.println("Temperature of the first flask = " + temperature1);
        System.out.println("Temperature of the second flask = " + temperature2);

        if (chekTemp(temperature1,temperature2)) {
            System.out.println("Work correct");
        } else {
            System.out.println("Don`t work");
        }
    }

    public static boolean chekTemp (int num1, int num2) {
        return num1 >= 100 && num2 <= 100;
    }
}
