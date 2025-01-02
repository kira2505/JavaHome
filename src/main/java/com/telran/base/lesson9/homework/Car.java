package com.telran.base.lesson9.homework;

public class Car {
    String model;
    double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
