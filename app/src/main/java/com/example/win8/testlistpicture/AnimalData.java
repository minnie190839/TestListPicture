package com.example.win8.testlistpicture;

import com.example.win8.testlistpicture.Model.Animals;

import java.util.ArrayList;


public class AnimalData {
    private static AnimalData sInstance;
    public static ArrayList<Animals> animalList;
    public static AnimalData getInstance() {
     if (sInstance == null) {
        sInstance = new AnimalData();
    }
        return sInstance;
}

}
