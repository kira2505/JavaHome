package com.telran.base.lesson9.homework;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        int[] arrays = {1, 2, 7, 4, 8, 9, 6, 5};
        int[] ints = new int[arrays.length + 1];
        Arrays.sort(arrays);

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
            int temp = arrays[i];
            ints[temp - 1] = temp;
        }

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                System.out.println("\nWe found : " + (i + 1));
                break;
            }
        }
    }
}
