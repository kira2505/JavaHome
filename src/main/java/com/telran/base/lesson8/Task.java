package com.telran.base.lesson8;

public class Task {

    public static void main(String[] args) {

        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 2;
        array[4] = 6;
        array[5] = 90;
        array[6] = 2;
        array[7] = 8;
        array[8] = 2;
        array[9] = 9;

        System.out.println(array[1]);
        System.out.println(array[8]);

        for (int i = 0; i <= 9; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i <= 9; i++) {
            array[i] = -1;
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(array[i]);
        }
    }
}
