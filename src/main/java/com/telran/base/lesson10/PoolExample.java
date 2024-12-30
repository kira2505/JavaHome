package com.telran.base.lesson10;

public class PoolExample {

    public static void main(String[] args) {
        String one = "Cat";
        String two = "Cat";
        String three = "Cat";

        System.out.println("one = two " + (one == two));

        String four = new String("Cat");
        System.out.println(four);

        System.out.println("one = four " + (one == four));

        System.out.println("one = four " + (one.equals(four)));

        if (one.equals(four)) {
            System.out.println("There are equals");
        }
    }
}
