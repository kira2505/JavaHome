package com.telran.base.lesson10;

public class TaskTwo {

    public static void main(String[] args) {
        String string = "hello java";

        System.out.println(getReverse(string));
    }

    public static String getReverse(String string) {
        StringBuilder sbOne = new StringBuilder();
        StringBuilder sbTwo = new StringBuilder();
        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            System.out.print(temp + " ");
            if (temp != ' ') {
                sbOne.append(temp);
            } else {
                index = i + 1;
                break;
            }
        }

        for (int i = index; i < string.length(); i++) {
            char temp = string.charAt(i);
                sbTwo.append(temp);
        }
        return sbTwo.append(" ").toString() + sbOne.toString();
    }
}
