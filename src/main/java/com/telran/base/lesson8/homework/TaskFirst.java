package com.telran.base.lesson8.homework;

import java.util.Random;

public class TaskFirst {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 50);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
