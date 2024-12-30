package com.telran.base.lesson9.homework;

import java.util.Arrays;

public class CarBubbleSort {

    public static void main(String[] args) {

        Car caroOne = new Car("BMW", 23000);
        Car carTwo = new Car("Audi", 10000);
        Car carThree = new Car("Porsche", 40000);
        Car carFour = new Car("Dodge", 30000);
        Car carFive = new Car("Toyota", 15000);

        Car[] cars = {caroOne, carTwo, carThree, carFour, carFive};

//        for (int i = 0; i < cars.length - 1; i++) {
//            if (cars[i].price >= cars{i + 1}.price) {
//                Car temp = cars[i + 1].price;
//                cars[i + 1] = cars[i];
//                cars[i] = car;
//            }
//        }

        for (int i = 0; i < cars.length; i++) {
        }

        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Model : " + car.model + "\nPrice = " + car.price);
            System.out.println(" ");
        }
    }

}
