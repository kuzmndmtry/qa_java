package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    private Feline feline; //ответь зачем это?

    public Lion(Feline feline) {
        this.feline = feline;
    }

    //Feline feline = new Feline(); Почему убрано?
    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
