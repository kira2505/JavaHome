package com.telran.base.lesson4;

public class Task {

    public static void main(String[] args) {
        int min = -20;
        int max = 20;
        int result = (int) (Math.random()*(max-min+1)+min);
        System.out.println(result);
        double doubleNumber = Math.random() * (max - min + 1) + min;

        //(int) - явное приведение типа
        System.out.println(doubleNumber);

    }
}





//Math.random
//
//Объявить минимальное значение диапазона
//Объявить максимальное значение диапазона
//Используйте формулу Math.random()*(max-min+1)+min для создания значений,
//включающих значение min и max
//Вывести в консоль случайное целое число из этого диапазона
