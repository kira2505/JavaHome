package com.telran.base.lesson3;

/**
 * Локальные переменные - переменные метода, конструктора и блока
 * Создаются внутри метода и уничтожаются, когда методы заканчивают работу
 *
 * Переменные экземпляра - переменные объявляются вне каких либо
 * блоков, методов или конструкторов
 * Создаются, когда создаются объекты (экземпляры) на основании класса
 * и уничтожаются когда уничтожаются объекты
 *
 * Статические переменные - переменная класса
 * Создаются при начале работы программы и уничтожаются при завершении
 * работы программы
 */
public class VariablesExample {

    int count = 50; //переменная экземпляра (переменная объявленная в классе)

    static int age = 25; //статическая переменная(переменная класса)

    public static void main(String[] args) {
        //Локальная переменная
        //переменная внутри метода
        //переменная живет внутри {}
        int number =10; //переменная метода main
        number =20;
        System.out.println(number);

        //Пример как осуществляется доступ к переменной экземпляра
        //VariablesExample variablesExample = new variablesExample();
        //System.out.println(variablesExample.count);
        System.out.println(age);
    }

    private static void print () {
        //Локальная переменная
        int number =5; //переменная метода print
        System.out.println(age);
        age = 20;
    }

    private void printCount() {
        System.out.println(count);
        System.out.println(age);
    }
}
