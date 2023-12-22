package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу",cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(feline);
        // напиши зачем это
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птица", "Рыба"));
        assertEquals(Arrays.asList("Животные", "Птица", "Рыба"),cat.getFood());
    }
}