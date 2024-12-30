package com.telran.base.lesson11;

/**
 * Для создаваемого объекта на основании этого класса, типом переменнрой
 * в которой будет хранится наш объект и будет тип нашего класса
 */

public class Car {

    String serialNumber;

    String color;

    String model;

    public Car() {
    }

    public Car(String color, String serialNumber, String model) {
        this.color = color;
        this.serialNumber = serialNumber;
        this.model = model;
    }

    public Car(String model) {
        this.model = model;
    }

//        //конструктор без параметров
//    public Car() {
//        System.out.println("Create new car");
//    }
//
//    //конструктор с параметроами
//    public Car(String serialNumber, String color) {
//        this.serialNumber = serialNumber;
//        this.color = color;
//    }
//
//    public Car(String serialNumber) {
//        this.serialNumber = serialNumber;
//    }

    public void drive() {
        System.out.println("Car with color " + this.color + " and serial number " +  this.serialNumber + " is driving");
    }
}
