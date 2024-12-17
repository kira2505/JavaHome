package com.telran.base.lesson7;

import java.util.Scanner;

public class ForExample {

    public static void main(String[] args) {
        for(int i =0; i < 5; i++) {  //++ - унарный оператор, увеличение на 1
            System.out.println("Hello");
            System.out.println("Bye");
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("enter number");
//            int num = scanner.nextInt();
//            printNumber(10);

            printRiverse(90);
        }
    }

    public static void printNumber (int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printRiverse (int num){
        for (int i = num; i >= 0; i --){
            System.out.println(i);
        }
    }
}
