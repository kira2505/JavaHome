package com.telran.base.lesson3;

public class Variables {
    static int staticVar = 10;

    int instanceVar = 11;

    public static void main(String[] args) {
        int localVar = 12;
        staticVar = staticVar + 1;
        localVar = localVar + 1;
        System.out.println(staticVar);
        System.out.println(localVar);
        print();
    }

    public static void print(){
        System.out.println(staticVar);
    }


}
