package com.telran.base.lesson8;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExample {

    public static void main(String[] args) {
        int[] ints = {2,5,7,4,67,89,3,4,56,7,8,88,76543,3,3,4,5,67,8,9,87,6};

        String array = Arrays.toString(ints);
        System.out.println(array);

        System.out.println(Arrays.toString(ints));

        int primitive = 5;
        Integer primitiveInt = 5;
        primitive = primitiveInt;

        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Integer[] intsOne = {4,657,8,78,79,9,7,6,54,3,245,6786,54};
        Arrays.sort(intsOne, Comparator.reverseOrder());
        System.out.println(Arrays.toString(intsOne));
    }
    //int - Integer
    //boolean - Boolean
    //char - Character
    //byte - Byte
    //long - Long
    //double - Double
    //float - Float
}
