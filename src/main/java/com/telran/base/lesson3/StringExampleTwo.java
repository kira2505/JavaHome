package com.telran.base.lesson3;

public class StringExampleTwo {
    public static void main(String[] args) {
        String text = "Hello";
        //можно прочитать длину строки
        System.out.println(text);
        //вызов метода, который сообщит длину строки
        //text.length()
        //Вызов метода вычисляющего длину строки и присвоение результата
        //в переменную textLength
        int textLength = text.length();
        System.out.println("Text Length = " + textLength);

        //Метод получения символа из строки по номерам(индекс)
        //номер называется индекс
        //символы в строке нумеруются с 0
        //первый символ хранится под номером 0, последений под номером n-1
        //где n - это длина строки
        //Hello - H-0, e-1, l-2, l-3, 0-4
        //charAt(index)
        char symbol = text.charAt(0);
        char symbolEnd = text.charAt(4);
        System.out.println("Symbol by 0 index = " + symbol);
        System.out.println("Symbol by 4 index = " + text.charAt(4));
        System.out.println("Symbol by 4 index = " + symbolEnd);

    }
}
