package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(5), calculatedCost);
    }
    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        //When
        String desciption = order.getDescription();
        //Then
        Assert.assertEquals("Drive a course", order.getDescription());
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(40), calculatedCost);
    }
    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        //When
        String desciption = order.getDescription();
        //Then
        Assert.assertEquals("Drive a course by Taxi Network", desciption);
    }
    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new MyTaxiNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        //When
        String desciption = order.getDescription();
        //Then
        Assert.assertEquals("Drive a course by MyTaxi Network + child seat.", desciption);
    }
    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new MyTaxiNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(37), calculatedCost);
    }
    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        order = new VipDecorator(order);
        order = new ChildSeatDecorator(order);
        System.out.println(order.getCost());
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(52), calculatedCost);
    }
    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        order = new VipDecorator(order);
        order = new ChildSeatDecorator(order);
        System.out.println(order.getDescription());
        //When
        String desciption = order.getDescription();
        //Then
        Assert.assertEquals("Drive a course by Taxi Network variant VIP + child seat.", desciption);
    }
}
