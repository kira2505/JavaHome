package com.telran.base.lesson4.example;

/**
 *Есть еще один метод который называется конструктором
 *Он называется так же, как и имя класса, включая регистр
 *и без типа возвращаемого параметра
 * Класс - это чертеж для создания объекта
 * Объект - это экземпляр определенного класса
 *
 * Класс - это чертеж автомобиля, Объект - физический автомобиль
 * созданный по этому чептежу
 */
public class Cat {
    //Переменная экземпляра
    String name;

    int age;

    //Конструктор, но это тоже метод
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
        //
    }
}