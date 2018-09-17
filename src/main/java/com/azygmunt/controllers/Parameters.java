package com.azygmunt.controllers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Parameters {
    private  String size;
    private   String number;
    private  String weight;

   private Parameters(){};

    @JsonCreator
    public Parameters(@JsonProperty("size") String size,
                      @JsonProperty("number") String number,
                      @JsonProperty("weight") String weight) {
        this.size = size;
        this.number = number;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "size='" + size + '\'' +
                ", number='" + number + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    private String getSize() {
        return size;
    }

    private String getNumber() {
        return number;
    }

    private String getWeight() {
        return weight;
    }
}
