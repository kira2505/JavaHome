package com.telran.base.lesson9;

public class TaskOne {

    public static void main(String[] args) {
        int[] array = {4,6,7,8,9,2,4,5,56,7,88,35,5,6,7,8};
        System.out.println("The biggest number in array is : " + maxElement(array));
        System.out.println("The smallest number in array is : " + minElement(array));

        int[] ints = {};

        System.out.println("The smaller number in array is : " + minElement(ints));

        int target = 8;
        printElement(array, target);
    }

    private static int maxElement (int[] array) {
        int maxnum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxnum) {
                maxnum = array[i];
            }
        }
        return maxnum;
    }

    private static int minElement (int[] array) {
        if (array.length != 0) {
            int minnum = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < minnum) {
                    minnum = array[i];
                }
            }
            return minnum;
        } else {
            return -1;
        }
    }

    private static void printElement (int [] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Element " + target + " is in this index : " + i);
            }
        }
    }

    private static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
//            if (array[i] >= max) {
//                max = array[i];
//            }
        }
        return max;
    }
}
