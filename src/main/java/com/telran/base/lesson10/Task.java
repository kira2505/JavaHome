package com.telran.base.lesson10;

public class Task {

    public static void main(String[] args) {
        String string = "hello java";

        System.out.println(getReverse(string));
    }

    public static String getReverse(String string) {
        StringBuilder sbOne = new StringBuilder();
        StringBuilder sbTwo = new StringBuilder();

        StringBuilder current = sbOne;

        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            if (temp == ' ') {
                current = sbTwo;
                continue;
            }
            current.append(temp);
        }
        return sbTwo.append(" ").toString() + sbOne.toString();
    }
}
