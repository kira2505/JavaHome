package com.telran.base.lesson12;

public class TaskOne {

    public static void main(String[] args) {
        int[] ints = {7,8,6,4,2,34,56,7,89,5};

        TaskOne taskOne = new TaskOne();
        int maxInt = taskOne.getMax(ints);
        System.out.println(maxInt);
    }

    public int getMax(int[] ints) {
        if (ints == null || ints.length == 0) {
            return -1;
        }
            int max = ints[0];
            for (int i = 1; i < ints.length; i++) {
                max = Math.max(max, ints[i]);
            }
            return max;
        }
    }
