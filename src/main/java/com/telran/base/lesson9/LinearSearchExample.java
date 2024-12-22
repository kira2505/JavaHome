package com.telran.base.lesson9;

public class LinearSearchExample {

    public static void main(String[] args) {
        int[] array = {4,6,7,8,9,2,4,5,56,7,88,35,5,6,7,8};
        int target = 35;

        System.out.println("Is element " + target + " found in array ? " + linearSearch(array,target));

        target = 50;
        System.out.println("Is element " + target + " found in array ? " + linearSearch(array,target));
    }

    private static boolean linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }
}
