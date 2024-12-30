package com.telran.base.lesson10;

public class StringExample {

    public static void main(String[] args) {
        String text = "Hello Java!";

        String[] strings = {"Hello", "problem one", "result one", "error", "result"};

        System.out.println(getanswer(strings));
    }

    private static String getanswer(String[] strings) {
        String answer = "";
        for (int i = 0; i < strings.length; i++) {
            answer = answer + " " + strings[i];
        }

        return answer;
    }
}
