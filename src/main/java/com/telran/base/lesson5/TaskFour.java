package com.telran.base.lesson5;

public class TaskFour {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 20;
        int d = 20;

        if (( a < b ) && ( b == c )) {
            System.out.println("correct1");
        }
        if ((a > b) || (c == d)) {
            System.out.println("correct2");
        }
        if (a != b){
            System.out.println("correct3");
        }
    }
}


/**
 *  Создаем переменные a,b,c,d
 *
 *  Используя блок if нужно составить логические выражения:
 *  1) истина, если a < b and b == c
 *  2) истина, если a > b or c == d
 *  3) истина, если a not equals b
 *
 */
