package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionCheeseDecorator extends AbstractPizzaOrderDecorator{

    public AdditionCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(3));
    }

    @Override
    public String getPizzaDesc() {
        return super.getPizzaDesc() + " %n + additional cheese";
    }
}
