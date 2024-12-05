package com.telran.base.lesson6;

import java.util.Scanner;

/**
 * switch (expression) {
 *     case 1:
 *     //code to execute A
 *     break;
 *
 *     case 2:
 *     //code to execute B
 *     break;
 *
 *     case 2:
 *     //code to execute C
 *     break;
 *
 *     case 4:
 *     case 5:
 *     case 6:
 *     //code to execute D
 *     break;
 *
 *     default:
 *     //code to execute
 * }
 *
 * В качестве выражения для сравнения используются либо строка, число, буква,
 * либо спецкласс Enum
 */

public class SwitchCaseExample {

    public static void main(String[] args) {
        System.out.println("Please input number from 0 to 5: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

//        switch (data) {
//            case 1 -> {
//                System.out.println("Your input 1");
//                System.out.println("Hello");
//            }
//            case 3 -> System.out.println("Your input 3");
//            case 2, 4 -> System.out.println("You are the best!");
//            case 5, 0 -> System.out.println("It is correct number!");
//            default -> System.out.println("Your input not in 0 to 5");
//        }

        switch (data) {
            case 1:
                System.out.println("Your input 1");

                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Your input 3");
                break;
            case 2:
            case 4:
                System.out.println("You are the best!");
                break;
            case 5:
            case 0:
                System.out.println("It is correct number!");
                break;
            default:
                System.out.println("Your input not in 0 to 5");
        }
        scanner.close();
    }
}