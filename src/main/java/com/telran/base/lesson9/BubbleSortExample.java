package com.telran.base.lesson9;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortExample {

    public static void main(String[] args) {
        //int[] array = {5,75,3,23,8,9,46,1,98,4,6,8,9,8,76,54,3,2,1,1,87,6,87,4,3,5,67,8,65,43,4,5,6,7,65,43};

        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,150);
        }
        System.out.println(Arrays.toString(array));

        int count = 0;

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                //int elone = array[i];
                //int eltwo = array[i + 1];
                if (array[i] >= array[i + 1]) {
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
