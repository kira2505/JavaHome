package com.telran.base.lesson10;

/**
 * Стековая память (Stack)
 * В стеке хранятся значения примитивных переменных
 * Когда запускается какой лиюо метод, для него создается блок стековой
 * памяти, в котором создаются примитивные переменные
 * Кагда метод заканчивает свою работу, то блок стековой памяти удаляется
 * и удаляет за собой примитивные переменные
 *
 * Куча (Heap)
 *
 */

public class MemoryExample {

    public static void main(String[] args) {
        int number = 10;
        print();
        String text = "hello";
        text = text + "Java";
    }

    public static void print() {
        int count;
        int[] array = {1,2,3,4,6,7};
    }
}
