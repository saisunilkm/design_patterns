package com.thoughtfocus.designpatterns.structural.decorator;

import com.thoughtfocus.designpatterns.structural.decorator.BasicBike;
import com.thoughtfocus.designpatterns.structural.decorator.Bike;
import com.thoughtfocus.designpatterns.structural.decorator.LuxuryBike;
import com.thoughtfocus.designpatterns.structural.decorator.SportsBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorDesignPatternTest {
    @Test
    void decoratorTest() {
        Bike sportsBike = new SportsBike(new BasicBike());
        assertEquals(sportsBike.assembleBike(), "Basic Bike...With Sports Bike Features");

        Bike luxuryBike = new LuxuryBike(new BasicBike());
        assertEquals(luxuryBike.assembleBike(), "Basic Bike...With Luxury Bike Features");

        Bike sportsLuxuryBike = new SportsBike(new LuxuryBike(new BasicBike()));
        assertEquals(sportsLuxuryBike.assembleBike(), "Basic Bike...With Luxury Bike FeaturesWith Sports Bike Features");
    }

}