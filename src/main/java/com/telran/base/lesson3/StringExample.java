package com.telran.base.lesson3;

public class StringExample {

    public static void main(String[] args) {
        String text = "Hello Java!!!";
        System.out.println(text);
        System.out.println("Hello Java!!!");

        //String - это ссылочный тип данных (строки это объекты),
        //внутри любой строки хранится набор символов
        //String text = "Hello Java!!!"; 'H', 'e', 'l', 'l', 'o'...
        //строка это массив символов!

        //Строки в Джаве неизменяемые
        text = "Hello!"; //при любой попытке изменить строку
        //в джаве будет создаваться новая строка
        //хеллоу джава будет оставаться в оперативной памяти и ждать пока мы ее удалим
        System.out.println(text);

        //String vs Primitive
        int count = 10; //место в памяти выделяется один раз
        count = 20;     //новое значение записывается в то же самое место
        count = 50;
        count = 60;

        String one = "Hello"; //выделяется место в памяти под слово Hello
        one = "Hi"; //будет выделено новое место в памяти под слово Hi
        one = "Java";
    }
}
