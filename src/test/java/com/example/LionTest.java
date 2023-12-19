package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


public class LionTest {

    @Test
    public void getKittens() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(feline);
        when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(feline);
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void createLionException() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion("Небинараная львиная личность");
    }
//    Вариант теста исключения
//    @Test(expected=Exception.class)
//    public void outOfBounds() throws Exception {
//        Lion lion = new Lion("Небинараная львиная личность");
//    }
}