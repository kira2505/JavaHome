package com.telran.base.lesson11.calc;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator eng = new Calculator("Eng");
        eng.printSum(10,3546);

        Calculator de = new Calculator("De");
        de.printSum(8790,67890);
        eng.printSum(78,87);
        eng.switchLanguage();
        eng.printSum(78,87);

    }
}
