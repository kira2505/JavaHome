package com.telran.base.lesson12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {

    @Test
    public void testGetMaxWhenAArrayCorrect() {
       int[] ints = {3,5,8,1};
        TaskOne taskOne = new TaskOne();
        int max = taskOne.getMax(ints);
        assertEquals(8,max);
    }

    @Test
    public void testGetMaxWhenArrayIsNull() {
        int[] ints = null;
        TaskOne taskOne = new TaskOne();
        int max = taskOne.getMax(ints);
        assertEquals(- 1 ,max);
    }

    @Test
    public void testGetMaxWhenArrayIsEmpty() {
        int[] ints = {};
        TaskOne taskOne = new TaskOne();
        int max = taskOne.getMax(ints);
        assertEquals(- 1 ,max);
    }
}