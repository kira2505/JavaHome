package com.telran.base.lesson5.homework;

import java.util.Random;

public class TaskTwo {

    public static void main(String[] args) {
        Random random = new Random();
        int sec = random.nextInt(28801);

        System.out.println(sec);

        if (sec == 28800) {
            System.out.println("Only 8 hours left until the end of the workday!");
        } else if (sec == 25200) {
            System.out.println("Only 7 hours left until the end of the workday!");
        } else if (sec == 21600) {
            System.out.println("Only 6 hours left until the end of the workday!");
        } else if (sec == 18000) {
            System.out.println("Only 5 hour left until the end of the workday!");
        } else if (sec == 14400) {
            System.out.println("Only 4 hours left until the end of the workday!");
        } else if (sec == 10800) {
            System.out.println("Only 3 hours left until the end of the workday!");
        } else if (sec == 7200) {
            System.out.println("Only 2 hour left until the end of the workday!");
        } else if (sec == 3600) {
            System.out.println("Only 1 hour left until the end of the workday!");
        } else if (sec == 0) {
            System.out.println("Workday is over!");
        } else if (sec <3600) {
            System.out.println("Less than an hour to go until the end of the workday!");
        } else {
            System.out.println("Get to work!!!");
        }
    }
}
