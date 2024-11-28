package com.telran.base.lesson4.example;

import java.util.Scanner;

public class CatApp {

    public static void main(String[] args) {
        //создание объекта на остовании класса, это вызов new
        Scanner scanner = new Scanner(System.in);
        Cat catOne = new Cat("Joker",10);
        Cat catTwo = new Cat();
    }
}