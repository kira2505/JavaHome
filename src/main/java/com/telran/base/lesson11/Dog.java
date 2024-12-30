package com.telran.base.lesson11;

public class Dog {

    String name;

    int age;

    String breed;

    int hight;

    public Dog(String name, int hight, String breed, int age) {
        this.name = name;
        this.hight = hight;
        this.breed = breed;
        this.age = age;
    }

    public Dog() {
    }

    public void methodPrint() {
        System.out.println("Dog " + name + " " + age + " " + breed + " " + hight);
    }
}
