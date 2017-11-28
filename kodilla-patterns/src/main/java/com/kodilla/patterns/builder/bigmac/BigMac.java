package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final String roll;
    private final int burgers;
    private final List<String> sauces;
    private final List<String> ingredients;

    public static class BigMacBuilder {
        private String roll;
        private int burgers;
        private List<String> sauces = new ArrayList<>();
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            sauces.add(sauce);
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(roll, burgers, sauces, ingredients);
        }
    }

    private BigMac(final String roll, final int burgers,
                   final List<String> sauces, final List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauces = new ArrayList<>(sauces);
        this.ingredients = new ArrayList<>(ingredients);
    }

        public String getRoll() {
            return roll;
        }

        public int getBurgers() {
            return burgers;
        }

        public List<String> getSauces() {
            return sauces;
        }

        public List<String> getIngredients() {
            return ingredients;
        }

        @Override
        public String toString() {
            return "BigmacBuilder{" +
                    "roll='" + roll + '\'' +
                    ", burgers=" + burgers +
                    ", sauces=" + sauces +
                    ", ingredients=" + ingredients +
                    '}';
        }
}

