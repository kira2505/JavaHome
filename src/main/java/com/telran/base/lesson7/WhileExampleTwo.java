package com.telran.base.lesson7;

import java.util.Scanner;

public class WhileExampleTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = null;
        while (!"Y".equals(data) && !"N".equals(data)) {
            System.out.println("Enter Y or N");
            data = scanner.next();
            if ("Y".equals(data)) {
                System.out.println("Let`s go");
            }
            if ("N".equals(data)) {
                System.out.println("Bye");
            }
        }
    }
}
