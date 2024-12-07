package com.telran.base.lesson6.homework;

import java.util.Random;

public class TaskOne {

    public static void main(String[] args) {
        Random random = new Random();
        boolean isEdekaOpen = random.nextBoolean();
        boolean isReweOpen = random.nextBoolean();
        
        System.out.println("I can buy food, it's " + canBuy(isEdekaOpen, isReweOpen));
    }

    public static boolean canBuy (boolean a, boolean b) {
        return a || b;
        }
    }