package com.telran.base.lesson7;

import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while (true) {
            System.out.println("1 - start, 2 - load, 3 - result, 4 - exit");
            int data = scanner.nextInt();
            switch (data) {
                case 1 -> startGame();
                case 2 -> loadGame();
                case 3 -> printResult();
                case 4 -> run = false;

            }
        }
    }

    public static void startGame() {
        System.out.println("start");
    }

    public static void loadGame() {
        System.out.println("load");
    }

    public static void printResult() {
        System.out.println("print");
    }
}