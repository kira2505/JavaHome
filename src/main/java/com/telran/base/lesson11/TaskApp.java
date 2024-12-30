package com.telran.base.lesson11;

import java.lang.reflect.Array;

public class TaskApp {

    public static void main(String[] args) {
        Dog dogOne = new Dog();
        dogOne.age = 10;
        dogOne.hight = 15;
        dogOne.breed = "maltepu";
        dogOne.name = "Sharik";

        Dog dogTwo = new Dog();
        dogTwo.name = "Bobik";
        dogTwo.breed = "mops";
        dogTwo.age = 2;
        dogTwo.hight = 20;

        Dog dogThree = new Dog();
        dogThree.hight = 56;
        dogThree.breed = "allabay";
        dogThree.age = 4;
        dogThree.name = "Rex";

        Dog[] dogs = {dogOne, dogTwo, dogThree};

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].name + " " + dogs[i].age + " " + dogs[i].breed + " " + dogs[i].hight);
        }

        System.out.println(dogOne.name + " " + dogOne.age + " " + dogOne.breed + " " + dogOne.hight);

        Dog dog = new Dog("Shark", 10, "kjfdhkg", 30);
        System.out.println(dog.age + dog.hight + dog.breed + dog.name);

        dogOne.methodPrint();
        dogTwo.methodPrint();
        dogThree.methodPrint();

        for (Dog doggi : dogs) {
            dog.methodPrint();
        }
    }
}
