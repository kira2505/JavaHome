package com.telran.base.lesson8;

//массив это набор элементов одного типа, расположенных в памяти друг за другом

public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[4];

        int[] intArray;
        intArray = new int[5];

        array[0] = 5;
        array[3] = 7;

        int temp = array[0];

        System.out.println("Element from 0 index : " + temp);

        int[] arrayOne = {9,4,5,6,3,78,7,2,2,1,43};

        for(int i = 0; i < arrayOne.length; i++) {
            System.out.println(arrayOne[i]);
        }
    }
}
