package com.thoughtfocus.designpatterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoratorDesignPatternTest {
    @Test
    void decoratorTest() {
        Bike sportsBike = new SportsBike(new BasicBike());
        assertEquals("Basic Bike...With Sports Bike Features", sportsBike.assembleBike());

        Bike luxuryBike = new LuxuryBike(new BasicBike());
        assertEquals("Basic Bike...With Luxury Bike Features", luxuryBike.assembleBike());

        Bike sportsLuxuryBike = new SportsBike(new LuxuryBike(new BasicBike()));
        assertEquals("Basic Bike...With Luxury Bike FeaturesWith Sports Bike Features", sportsLuxuryBike.assembleBike());
    }

}