package com.telran.base.lesson4;

/**
 * Методы должны называться глаголами и отображать что они делают
 * Сигнатура - это имя метода + параметры
 * Внутри одного класса методы должны иметь уникальную сигнатуру
 *
 * printInfo, run, start, jump, calculate (обычно это методы которые ничего не возвращают)
 *
 * getSum, getAge, generateCar, createStudent, getRandom (обычно это методы которые что то возвращают)
 *
 * Желательно что бы метод делал что то одно
 * Например назвать метод printStudentInfo , в котором создать студента и потом его вывести в консоль
 * - плохая идея
 *
 * Правильно сделать так: сделать метод который создаст и вернет студента createStudent
 * и сделать метод printStudentInfo, который примет в параметрах студента и его выведет в консоль
 */

public class MethodTypesExample {

    //1 - Метод ничего не принимает и ничего не возвращает
    public static void print(){
        //body
    }

    //2 - Метод принимает параметры и ничего не возвращает
    public static void printText(String text, int number) {
        //body
    }

    //3 - Метод ничего не принимает и что то возвращает
    public static int getAge() {
        //return - оператор, который возвращает значение из метода
        return 35;
    }

    //4 - Метод принимает пораметры и возвращает что-то
    public static int getSum(int a, int b){
        int sum = a + b;
        return sum;
    }

}
