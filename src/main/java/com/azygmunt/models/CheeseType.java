package com.azygmunt.models;

/**
 * Created by azygm on 16.04.2017.
 */
public enum CheeseType {

    HARD ("Hard"),
    SOFT ("Soft"),
    FAKE ("Fake");

    private final String name;

    CheeseType(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
