package com.telran.base.lesson6;

public class StringEqualsExample {

    public static void main(String[] args) {
        System.out.println("Say something : ");
        String userData = null;
        boolean equalsHello = isEqualsHello(userData);
        if (equalsHello) {
            System.out.println("Hi user");
        }
    }

    public static boolean isEqualsHello(String value) {
        if ("Hello".equals(value)) { //!!!
            return true;
        }

        return false;
    }
}
