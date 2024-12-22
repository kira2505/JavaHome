package com.telran.base.lesson8.homework;

import java.util.Random;

public class TaskSecond {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 99);
            System.out.print(array[i] + " ");

        }
        boolean chek = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[i + 1]) {
            chek = false;
            break;
            }
        }

        if (chek) {
            System.out.println("\nArray with strictly increasing sequence");
        } else {
            System.out.println("\nArray not in strictly increasing order");
        }
    }
}
