package com.example;

import java.util.List;

public class LionAlex extends Lion {

    public LionAlex() throws Exception {
        super("Самец");
    }


    @Override
    public int getKittens() {
        return 0;
    }
    public List<String> getFriends() throws Exception {
        return List.of("Марти", "Мелман", "Глория");
    }
    public String getPlaceOfLiving() throws Exception {
        return "Нью-Йоркский зоопарк";
    }

}
