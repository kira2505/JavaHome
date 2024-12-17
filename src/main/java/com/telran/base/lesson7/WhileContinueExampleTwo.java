package com.telran.base.lesson7;

import java.util.Scanner;

public class WhileContinueExampleTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Y or N");
            String data = scanner.next();
            if ("Y".equals(data)) {
                System.out.println("Let`s go");
                break;
            }
            if ("N".equals(data)) {
                System.out.println("Bye");
                break;
            }
        }
    }
}
