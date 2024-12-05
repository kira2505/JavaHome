package com.telran.base.lesson6;

import java.util.Scanner;

/**
 * Ввести с консоли день недели
 * написать блок свитч где если введен понедельник это тяжелый день
 * если вт ср чт - работаем
 *
 */
public class Task {

    public static void main(String[] args) {
        System.out.println("Please input day of week: ");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();

        switch (data) {
            case "Monday" -> System.out.println("Hard day");
            case "Tuesday", "Thursday", "Wednesday" -> System.out.println("Working");
            case "Friday" -> System.out.println("Happy");
            case "Saturday", "Sunday" -> System.out.println("Chill");
            default -> System.out.println("It is not a day of week");
        }
        scanner.close();
    }
}
