package com.azygmunt.models;

import java.util.ArrayList;

/**
 * Created by azygm on 16.04.2017.
 */
public class CheeseData {
    static ArrayList<Cheese> cheeses = new ArrayList<>();

    public static ArrayList<Cheese> getAll() {
        return cheeses;
    }

    public static void add(Cheese newCheese){
        cheeses.add(newCheese);
    }

    public static void remove(int id){
        Cheese cheeseToTemoce = getById(id);
        cheeses.remove(cheeseToTemoce);
    }

    public static Cheese getById(int id){
        Cheese theCheese = null;
        for (Cheese candidateCheese : cheeses){
            if (candidateCheese.getCheeseId() == id){
                theCheese = candidateCheese;
            }
        }
        return theCheese;
    }
}
