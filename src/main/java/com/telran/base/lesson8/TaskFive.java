package com.telran.base.lesson8;

public class TaskFive {

    public static void main(String[] args) {
        int n = 5;
        int[] array = {1,2,3,5};
        int[] arrayTwo = new int[5];
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            arrayTwo[temp - 1] = temp;
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i] + " ");
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            if (arrayTwo[i] == 0) {
                System.out.println("\nWe found " + (i + 1));
                arrayTwo[i] = i + 1;
                break;
            }
        }
    }
}
