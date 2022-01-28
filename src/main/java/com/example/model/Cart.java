package com.example.model;

import java.util.HashMap;

public class Cart {
    HashMap<String,Integer> map=new HashMap<>();

    public Cart() {
    }

    public Cart(HashMap<String, Integer> map) {
        this.map = map;
    }

    public HashMap<String, Integer> getMap() {
        return map;
    }

    public void setMap(HashMap<String, Integer> map) {
        this.map = map;
    }
}
