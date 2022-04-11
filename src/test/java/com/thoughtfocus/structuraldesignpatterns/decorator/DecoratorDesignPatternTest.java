package com.thoughtfocus.structuraldesignpatterns.decorator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorDesignPatternTest {
    @Test
    public void decoratorForSportsBike_IncludingBasicBike() {
        Bike sportsBike = new SportsBike(new BasicBike());
        assertEquals(sportsBike.assembleBike(), "Basic Bike...With Sports Bike Features");
    }

    @Test
    public void decoratorForLuxuryBike_IncludingBasicBike() {
        Bike luxuryBike = new LuxuryBike(new BasicBike());
        assertEquals(luxuryBike.assembleBike(), "Basic Bike...With Luxury Bike Features");
    }

    @Test
    public void decoratorForLuxuryBikeAndSportsBike_IncludingBasicBike() {
        Bike sportsLuxuryBike = new SportsBike(new LuxuryBike(new BasicBike()));
        assertEquals(sportsLuxuryBike.assembleBike(), "Basic Bike...With Luxury Bike FeaturesWith Sports Bike Features");
    }
}