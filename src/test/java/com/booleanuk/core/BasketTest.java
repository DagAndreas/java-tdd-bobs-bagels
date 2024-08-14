package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    void testConstructor(){
        Basket basket = new Basket();
    }


    @Test
    void testAddBagel(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.addBagel("Whole wheat"));
    }
}
