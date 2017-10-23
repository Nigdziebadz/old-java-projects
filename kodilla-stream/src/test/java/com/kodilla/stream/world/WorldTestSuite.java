package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        String s = "poland";
        BigDecimal bd = new BigDecimal("4567898765456789");
        Country poland = new Country(s, bd);
        Country germany = new Country("Poland", new BigDecimal("123456765432342"));
        Country france = new Country("Poland", new BigDecimal("7656789087653243"));
        Country egipt = new Country("Poland", new BigDecimal("65789876543234567"));
        Country maroko = new Country("Poland", new BigDecimal("4567898765456789"));
        Country china = new Country("Poland", new BigDecimal("87656009876789876"));
        Country korea = new Country("Poland", new BigDecimal("6576543567876789"));

        //When
        Continent europe = new Continent();
        europe.getCountry().add(poland);
        europe.getCountry().add(germany);
        europe.getCountry().add(france);
        Continent africa = new Continent();
        africa.getCountry().add(egipt);
        africa.getCountry().add(maroko);
        Continent asia = new Continent();
        asia.getCountry().add(china);
        asia.getCountry().add(korea);
        World world = new World();
        world.getContinentList().add(asia);
        world.getContinentList().add(europe);
        world.getContinentList().add(africa);


        //Then
        BigDecimal expectedPeople = new BigDecimal("176938473371900395");
        Assert.assertEquals(expectedPeople, world.getPeopleQuantity());
    }
}
