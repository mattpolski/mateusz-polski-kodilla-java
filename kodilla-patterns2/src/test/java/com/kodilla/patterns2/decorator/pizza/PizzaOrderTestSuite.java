package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testOrderBasicPizzaGetCost() {
        PizzaOrder order = new BasicPizza();
        BigDecimal cost = order.getPrice();

        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testOrderBasicPizzaGetDescription() {
        PizzaOrder order = new BasicPizza();
        String description = order.getDescription();

        assertEquals("Your ordered pizza contains: dough + tomato sauce + cheese", description);
    }

    @Test
    public void testOrderPizzaWithBaconMushroomsExtraCheeseGetCost() {
        PizzaOrder order = new BasicPizza();
        order = new BaconDecorator(order);
        order = new MushroomsDecorator(order);
        order = new ExtraCheeseDecorator(order);

        BigDecimal cost = order.getPrice();

        assertEquals(new BigDecimal(22.5), cost);
    }

    @Test
    public void testOrderPizzaWithBaconMushroomsExtraCheeseGetDescription() {
        PizzaOrder order = new BasicPizza();
        order = new BaconDecorator(order);
        order = new MushroomsDecorator(order);
        order = new ExtraCheeseDecorator(order);

        String description = order.getDescription();

        assertEquals("Your ordered pizza contains: dough + tomato sauce + cheese + bacon + mushrooms + extra cheese", description);
    }

}
