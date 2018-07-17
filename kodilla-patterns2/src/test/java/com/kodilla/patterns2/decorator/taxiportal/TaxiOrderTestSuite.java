package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();

        BigDecimal calculatedCost = theOrder.getCost();

        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();

        String description = theOrder.getDescription();

        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        BigDecimal theCost = theOrder.getCost();
        assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        String description = theOrder.getDescription();

        assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        BigDecimal cost = theOrder.getCost();

        assertEquals(new BigDecimal(37), cost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        String description = theOrder.getDescription();

        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }

    @Test
    public void testUberWithTwoChildSeatsGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new UberNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        order = new ChildSeatDecorator(order);

        BigDecimal cost = order.getCost();

        assertEquals(new BigDecimal(29), cost);
    }

    @Test
    public void testUberWithTwoChildSeatsGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new UberNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        order = new ChildSeatDecorator(order);

        String description = order.getDescription();

        assertEquals("Drive a course by Uber Network + child seat + child seat", description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        order = new VipDecorator(order);
        order = new ChildSeatDecorator(order);
        System.out.println(order.getCost());

        BigDecimal cost = order.getCost();

        assertEquals(new BigDecimal(52), cost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        order = new VipDecorator(order);
        order = new ChildSeatDecorator(order);
        System.out.println(order.getDescription());

        String description = order.getDescription();

        assertEquals("Drive a course by Taxi Network variant VIP + child seat", description);
    }
}
