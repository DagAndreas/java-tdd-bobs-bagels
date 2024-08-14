package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    void testAddBagel(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.addBagel("Whole wheat"));
        Assertions.assertTrue(basket.addBagel("Whole wheat"));
        Assertions.assertTrue(basket.addBagel("Whole wheat"));
        Assertions.assertTrue(basket.addBagel("Whole wheat"));
        Assertions.assertTrue(basket.addBagel("Whole wheat"));
        Assertions.assertFalse(basket.addBagel("Whole wheat"));
    }

    @Test
    void testRemoveBagel() {
        Basket basket = new Basket();
        basket.addBagel("Italian");
        Assertions.assertTrue(basket.removeBagel("Italian"));
        Assertions.assertFalse(basket.removeBagel("Whole wheat"));
        Assertions.assertFalse(basket.removeBagel("Italian"));
    }


    @Test
    void testRemoveBagelOverloaded(){
        Basket basket = new Basket();
        basket.addBagel("Italian");
        Assertions.assertTrue(basket.removeBagel());
        Assertions.assertFalse(basket.removeBagel());

        basket.addBagel("a round one");
        Assertions.assertTrue(basket.removeBagel());
        Assertions.assertFalse(basket.removeBagel());
        Assertions.assertFalse(basket.removeBagel());
    }



    @Test
    void testGetMaxSize(){
        Basket basket = new Basket();
        Assertions.assertEquals(basket.getMaxSize(), 5);
    }

    @Test
    void testSetMaxSize(){
        Basket basket = new Basket();
        Assertions.assertEquals(basket.getMaxSize(), 5);

        basket.setMaxSize(10);
        Assertions.assertEquals(basket.getMaxSize(), 10);
    }
}
