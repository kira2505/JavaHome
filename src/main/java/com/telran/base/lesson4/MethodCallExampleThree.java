package com.telran.base.lesson4;

public class MethodCallExampleThree {

    public static void main(String[] args) {
        String result = getGreetings();
        System.out.println("Gritings : " + result);
        int code = getCode();
        System.out.println("Code is " + code);
    }

    public static String getGreetings() {
        String text = "Hello!";
        return text;
    }

    public static int getCode() {
        return 765;
    }
}
