package com.telran.base.lesson6;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
        System.out.println("1 - Say hello, 2 - Say bye");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        System.out.println(getWordWithTernary(data));
        System.out.println(data == 1 ? getBye() : getHello());
    }

    private static String getWord(int data) {
        if (data == 1) {
            return "Hello";
        } else {
            return "Bye";
        }
    }

    private static String getWordWithTernary (int data) {
        return data == 1 ? "Hello" : "Bye";
    }

    private static String getHello() {
        return "Hello";
    }

    private static String getBye () {
        return "Bye";
    }
}
