package com.telran.base.lesson11;

public class CarApp {

    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car();

        carOne.serialNumber = "AHGUHO895474";
        carOne.color = "black";
        carOne.model = "BMW";
        carTwo.serialNumber = "JDOIFCSD7854";
        carTwo.color = "pink";

        String serialNumberOne = carOne.serialNumber;
        String serialNumberTwo = carTwo.serialNumber;

        System.out.println(serialNumberOne);
        System.out.println(serialNumberTwo);

        System.out.println(carOne.color);
        System.out.println(carTwo.color + carTwo.serialNumber);

//        Car carThree = new Car("RIUEHFI9358593", "white");
//        System.out.println(carThree.serialNumber + " " + carThree.color);

        Car carFour = new Car("FHGIHJFG5678");
        System.out.println(carFour.color + " " + carFour.serialNumber);

        carFour.drive();
        carOne.drive();
        carTwo.drive();
    }
}
