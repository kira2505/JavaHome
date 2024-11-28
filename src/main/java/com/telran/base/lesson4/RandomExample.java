package com.telran.base.lesson4;

import java.util.Random;

/**
 * Когда в переменную записаои примитивное гначение,
 * используем фразу - обращаемся к этому объекту
 *
 * Когда в переменную записали ссылочное значение(создание через new),
 * тогда переменная хранит не значение, а ссылку на объект
 * используем фразу - обращаемся к этому объекту, вызываем у этого объекта
 */
public class RandomExample {

    public static void main(String[] args) {
        //Random - класс для генерации случайного числа
        Random random = new Random();
        //случайное целое число в диапазоне инта
        int numberOne = random.nextInt();
        System.out.println("Random int = " + numberOne);

        int numberTwo = random.nextInt(100);
        System.out.println("Random int = " + numberTwo);

        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(-100,100));
    }
}
