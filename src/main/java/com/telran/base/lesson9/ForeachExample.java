package com.telran.base.lesson9;

public class ForeachExample {

    public static void main(String[] args) {
        int[] array = {4,6,7,8,9,2,4,5,56,7,88,35,5,6,7,8};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //for (<type> <name variable> : <array>)
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
