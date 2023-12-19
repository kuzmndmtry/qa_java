package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionAlexTest {

    @Test
    public void getKittens() throws Exception {
        LionAlex lionAlex = new LionAlex();
        assertEquals(0,lionAlex.getKittens());

    }

    @Test
    public void getFriends() throws Exception {
        LionAlex lionAlex = new LionAlex();
        assertEquals(List.of("Марти", "Мелман", "Глория"),lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        LionAlex lionAlex = new LionAlex();
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }
    @Test
    public void doesHaveMane() throws Exception {
        LionAlex lionAlex = new LionAlex();
        assertTrue(lionAlex.doesHaveMane());
    }

}