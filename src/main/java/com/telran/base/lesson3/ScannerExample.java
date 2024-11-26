package com.telran.base.lesson3;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //объект для чтения данных из консоли
        Scanner scanner = new Scanner(System.in);

        //nextInt(); - чтение числа с консоли
        System.out.println("Please input your number : ");
        int dataFromConsole = scanner.nextInt();
        System.out.println("Half = " + dataFromConsole / 2);

        //next() - читает слово с консоли, вернет тип данных стринг
        System.out.println("Please input one word in console : ");
        String wordFromUser = scanner.next();
        //option - enter - enter - генерирует левую часть
        System.out.println("String length = " + wordFromUser.length());

        //nextLine(); - позволяет читать предложения с консоли от 0 до конца строки
        System.out.println("Please input your Name and Surname : ");
        String userData = scanner.nextLine(); // \n,\r
        System.out.println("Hello ! " + userData);

        scanner.close();
        //если надо заккоментировать строку command + /
    }
}
