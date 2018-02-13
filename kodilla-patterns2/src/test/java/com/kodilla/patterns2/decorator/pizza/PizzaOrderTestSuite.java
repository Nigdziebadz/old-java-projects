package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testStandardPizzaOrderGetCost() {
        //Given
        PizzaOrder newOrder = new StandardPizzaOrder();
        //When
        BigDecimal calculatedCost = newOrder.getPizzaCost();
        //Then
        Assert.assertEquals(new BigDecimal(15), calculatedCost);
    }
    @Test
    public void testStandardPizzaOrderGetDescription() {
        //Given
        PizzaOrder order = new StandardPizzaOrder();
        //When
        String desciption = order.getPizzaDesc();
        System.out.printf(order.getPizzaDesc());
        //Then
        Assert.assertEquals("Standard pizza pie %n + basic tomato sauce %n + cheese", order.getPizzaDesc());
    }

    @Test
    public void testPizzaOrderWithAddCheeseGetDescription() {
        //Given
        PizzaOrder order = new StandardPizzaOrder();
        order = new AdditionCheeseDecorator(order);
        //When
        String desciption = order.getPizzaDesc();
        System.out.printf(order.getPizzaDesc());
        System.out.printf("%n Total cost : " + order.getPizzaCost());
        //Then
        Assert.assertEquals("Standard pizza pie %n + basic tomato sauce %n + cheese %n + additional cheese", desciption);
    }
    @Test
    public void testPizzaOrderWithLotOfComponents() {
        //Given
        PizzaOrder order = new StandardPizzaOrder();
        order = new AdditionCheeseDecorator(order);
        order = new AdditionCheeseDecorator(order);
        order = new PeperoniDecorator(order);
        order = new OlivesDecorator(order);
        //When
        String desciption = order.getPizzaDesc();
        System.out.printf(order.getPizzaDesc());
        System.out.printf("%n Total cost : " + order.getPizzaCost());
        BigDecimal pizzaCalculatedCost = order.getPizzaCost();
        //Then
        Assert.assertEquals("Standard pizza pie %n + basic tomato sauce %n " +
                "+ cheese %n + additional cheese %n + additional cheese %n + peperoni sausage %n + black olives", desciption);
        Assert.assertEquals(new BigDecimal(25), pizzaCalculatedCost);
    }
}
