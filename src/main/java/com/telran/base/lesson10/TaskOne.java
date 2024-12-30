package com.telran.base.lesson10;

public class TaskOne {

    public static void main(String[] args) {
        String[] strings = {"Hello", "problem one", "result one", "error", "result" , "Java"};
        String[] stringsTwo = {"Hello", "problem one", "result one", "error", "result"};

        char[] arr = {'I','L','i','k','?', ' ','J','a','v','a'};

        System.out.println(concatReverseString(strings,stringsTwo));

        System.out.println(changer(arr));
    }

    private static String concatReverseString(String[] strings, String[] stringsTwo) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]).append(" ");
        }

        for (int i = 0; i < stringsTwo.length; i++) {
            sb.append(stringsTwo[i]).append(" ");
        }
        sb.reverse();
        return sb.toString();
    }

    public static String changer(char[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                sb.append('e');
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }


}
