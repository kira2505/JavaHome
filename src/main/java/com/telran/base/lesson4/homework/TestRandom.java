package com.telran.base.lesson4.homework;

import java.util.Random;

public class TestRandom {

    int num1;
    int num2;

    public static void main(String[] args) {
        TestRandom testRandom = new TestRandom();
    }

    public TestRandom() {
        Random random = new Random();

        this.num1 = random.nextInt(1, 100);
        this.num2 = random.nextInt(1, 100);

        System.out.println("Random Number 1: " + num1);
        System.out.println("Random Number 2: " + num2);
    }
}