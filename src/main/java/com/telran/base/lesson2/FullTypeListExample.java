package com.telran.base.lesson2;

public class FullTypeListExample {
    //defoult value 0
    public static void main(String[] args) {
    byte byteNumber = 100; //-128 to 127 8bits
    //byte testnumber = 500; incorrect
    short shortNumber = 14567; //-32768 to 32767; 16bits
    int intNumber = 343423423; //-2billion to 2 billion; 32bits
    long longNumber = 3445345345453L; //64bits

    //default value 0.0
    float floatNumber = 124343.34234f; //8 before . 7 after; 32bits
    double doubleNumber = 323223233233.3333333; //16 before . 16 after; 64bits

    byte byteNumberTest = 10;
    byte ByteNumberTestTwo = byteNumberTest;

    int intTest = byteNumberTest;
    long longTest = byteNumberTest;

    //byte byteTest = longTest; - incorrect
    byte byteTest = (byte) longTest;   //кастомизация, привидения типа

    //default value '\u0000'
    char charSym = 'A'; //16bits

    // default value false
    boolean booleanType = true; //1bit

    //default value null
    String text = "Hello Java!";
    }
}
