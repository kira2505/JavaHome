package com.telran.base.lesson11;

public class PersonApp {

    public static void main(String[] args) {
        Person alex = new Person("Alex", 37);
        Person max = new Person("Max", 67);
        
        System.out.println(alex);
        System.out.println(max);

        String name = alex.name;
    }
}
