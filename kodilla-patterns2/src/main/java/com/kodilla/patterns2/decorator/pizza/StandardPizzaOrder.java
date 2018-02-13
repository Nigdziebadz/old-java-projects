package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class StandardPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getPizzaCost() {
        return new BigDecimal(15.00);
    }
    @Override
    public String getPizzaDesc() {
        return "Standard pizza pie %n + basic tomato sauce %n + cheese";
    }
}
