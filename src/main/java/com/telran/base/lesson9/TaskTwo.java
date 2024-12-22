package com.telran.base.lesson9;

import java.util.Arrays;
import java.util.Random;

public class TaskTwo {

    public static void main(String[] args) {
        int[] array = {2,5,7,4,67,89,3,4,56,7,8,88,76543,3,3,4,5,67,8, -6, 9,87,6};
        System.out.println(Arrays.toString(array));

        int count = 0;

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                //int elone = array[i];
                //int eltwo = array[i + 1];
                if (array[i] <= array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }

                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Number of iterations : " + count);
    }
}
