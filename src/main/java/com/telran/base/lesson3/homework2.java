package com.telran.base.lesson3;

import java.util.Locale;
import java.util.Scanner;

public class homework2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordOne, wordTwo;
        int letterCountOne, letterCountTwo;

        while (true) {
            System.out.println("Please enter your word into the console : ");
            wordOne = scanner.nextLine();

            letterCountOne = 0;
            for (char c: wordOne.toCharArray()) {
                if (Character.isLetter(c)) {
                    letterCountOne++;
                }
            }

            System.out.println("Number of letters in a word : " + letterCountOne);

            if (letterCountOne % 2 ==0) {
                break;
            }
            else {
                System.out.println("The number of letters in the word is odd!");
                System.out.println("Please enter a word with an even number of letters.");
            }
        }

        while (true) {
            System.out.println("Please enter another word into the console : ");
            wordTwo = scanner.nextLine();

            letterCountTwo = 0;
            for (char c : wordTwo.toCharArray()) {
                if (Character.isLetter(c)) {
                    letterCountTwo++;
                }
            }

            System.out.println("Number of letters in a word : " + letterCountTwo);

            if (letterCountTwo % 2 ==0) {
                    break;
                }
                else {
                    System.out.println("The number of letters in the word is odd!");
                    System.out.println("Please enter a word with an even number of letters.");
                }
        }

        String halfOne = wordOne.substring(0, letterCountOne / 2);
        String halfTwo = wordTwo.substring(0, letterCountTwo / 2);
        String newWord = halfOne + halfTwo;

        System.out.println("Your new word : " + newWord);

        String string = new String("I study Basic Java!");
        System.out.println("I study Basic Java!");

        processString(string);

        scanner.close();
    }

    public static void processString(String string){
        char lastChar = string.charAt(string.length() - 1);
        System.out.println("Last character of the line : " + lastChar);

        boolean contains = string.contains("Java");
        System.out.println("Does the string contain 'Java' : " + contains);

        String replaced = string.replace('a', 'o');
        System.out.println("Line after replacing 'a' with 'o; : " + replaced);

        String upperCase = string.toUpperCase(Locale.ROOT);
        System.out.println("Uppercase string : " + upperCase);

        String lowerCase = string.toLowerCase();
        System.out.println("Lowercase string : " + lowerCase);

        if (string.contains("Java")) {
            int startIndex = string.indexOf("Java");
            int endIndex = startIndex + "Java".length();

            String substringString = string.substring(0, startIndex) + string.substring(endIndex);
            System.out.println("Line without the word 'Java' : " + substringString);
        }
        else {
            System.out.println("Word 'Java' not found.");
        }
    }
}