package com.telran.base.lesson8;

import java.util.Random;

public class TaskFour {

    public static void main(String[] args) {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        Random random = new Random();

        int daysRandom = random.nextInt(0, days.length);
        System.out.println(days[random.nextInt(0, days.length)]);

//        for (int d = 0; d < 100; d++) {
//            int d = random.nextInt(0, str.length);
//            System.out.println(str[d]);
//        }
    }
}
