package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomDecorator extends AbstractPizzaOrderDecorator {
    public MushroomDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(2));
    }

    @Override
    public String getPizzaDesc() {
        return super.getPizzaDesc() + " %n + mushrooms";
    }
}
