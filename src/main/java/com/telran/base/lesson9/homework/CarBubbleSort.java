package com.telran.base.lesson9.homework;

import java.util.Arrays;

public class CarBubbleSort {

    public static void main(String[] args) {
        Car carOne = new Car("BMW", 23000);
        Car carTwo = new Car("Audi", 10000);
        Car carThree = new Car("Porsche", 40000);
        Car carFour = new Car("Dodge", 30000);
        Car carFive = new Car("Toyota", 15000);

        Car[] cars = {carOne, carTwo, carThree, carFour, carFive};

        for (int j = 0; j < cars.length - 1; j++) {
            for (int i = 0; i < cars.length - 1 - j; i++) {
                if (cars[i].price > cars[i + 1].price) {
                    Car temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Cars price " + cars[i].price);
        }

        for (int j = 0; j < cars.length - 1; j++) {
            for (int i = 0; i < cars.length - 1 - j; i++) {
                if (cars[i].model.compareTo(cars[i + 1].model) > 0) {
                    Car temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                }
            }
        }

        System.out.println("");

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Cars model " + cars[i].model);
        }
    }
}
