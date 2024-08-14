package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    //public static HashMap<String, Intege>
    static int maxBasketSize = 5; // default value
    private ArrayList<String> basket = new ArrayList<>();

    public boolean addBagel(String type){
        if (basket.size() < maxBasketSize){
            basket.add(type);
            return true;
        }
        System.out.println("Basket is full. Can't add " + type);
        return false;
    }

}
