package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testNewStandardBigMac() {
        //Given
        BigMac standardBigMac = new BigMac.BigMacBuilder()
                .roll("Standard roll")
                .burgers(1)
                .sauce("Standard")
                .ingredient("Salad")
                .ingredient("Becon")
                .ingredient("Cheese")
                .ingredient("Sliced cucumber")
                .build();
        System.out.println(standardBigMac);
        //When
        int howManyIngredients = standardBigMac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }

    @Test
    public void testOverkillBigMac() {
        //Given
        BigMac overkillBigMac = new BigMac.BigMacBuilder()
                .roll("Sesame roll ")
                .burgers(4)
                .sauce("Standard")
                .sauce("Thousand Island dressing")
                .sauce("Barbecue")
                .ingredient("Salad")
                .ingredient("Bacon")
                .ingredient("Bacon")
                .ingredient("Cheese")
                .ingredient("Cheese")
                .ingredient("Chilli peppers")
                .ingredient("Chilli peppers")
                .build();
        System.out.println(overkillBigMac);
        //When
        int howManyIngredients = overkillBigMac.getIngredients().size();
        int howManySauces = overkillBigMac.getSauces().size();
        //Then
        Assert.assertEquals(7, howManyIngredients);
        Assert.assertEquals(3, howManySauces);
    }
}