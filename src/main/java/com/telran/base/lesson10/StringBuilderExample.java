package com.telran.base.lesson10;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.append(" ").append("class").append(" Ok!");
        String result = sb.toString();
        System.out.println(sb);
        System.out.println(result);
        sb.delete(2,5);
        System.out.println(sb.toString());
        System.out.println(sb.reverse());

        String[] strings = {"Hello", "problem one", "result one", "error", "result"};
        System.out.println(getanswer(strings));
    }

    private static String getanswer(String[] strings) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            answer.append(strings[i]).append(" ");
        }

        return answer.toString();
    }
}
