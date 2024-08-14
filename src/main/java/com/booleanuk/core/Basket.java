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

    public boolean removeBagel(String type){
        if(basket.contains(type)){
            basket.remove(type);
            return true;
        }

        if(basket.isEmpty()) {
            System.out.println("Basket is empty.");
        }
        else {
            System.out.println(type + " is not in basket.");
        }
        return false;
    }

    public int getMaxSize(){
        return maxBasketSize;
    }

    public void setMaxSize(int newSize){
        maxBasketSize = newSize;
    }

}
