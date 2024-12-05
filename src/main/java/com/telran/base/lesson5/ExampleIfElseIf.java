package com.telran.base.lesson5;

import java.util.Scanner;

/**
 * if-else-if ladder
 * if (condition) {
 *
 * } else if (condition) {
 *
 * } else if(condition) {
 *
 * } else {
 *
 * }
 */
public class ExampleIfElseIf {

    public static void main(String[] args) {
        System.out.println("Please input number 10: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        if (data ==10) {
            System.out.println("your number is 1");
        } else if (data ==2) {
            System.out.println("your number is 2");
        } else if (data ==3) {
            System.out.println("your number is 3");
        } else if (data ==4) {
            System.out.println("your number is 4");
        } else if (data ==5) {
            System.out.println("your number is 5");
        } else if (data ==6) {
            System.out.println("your number is 6");
        }
    }
}
