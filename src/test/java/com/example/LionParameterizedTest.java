package com.example;


import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private String sex;
    private boolean hasMane;


    public LionParameterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }
    @Parameterized.Parameters
    public static Object[][] getLionInfo() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex);
        assertEquals(hasMane,lion.doesHaveMane());
    }



}