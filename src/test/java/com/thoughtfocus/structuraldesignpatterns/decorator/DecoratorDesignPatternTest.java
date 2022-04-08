package com.thoughtfocus.structuraldesignpatterns.decorator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorDesignPatternTest {
    @Test
    public void luxuryBike(){
        Bike luxuryBike = new LuxuryBike(new BasicBike());
        assertEquals(luxuryBike.assembleBike(),"Adding features to Luxury Bike");
    }
    @Test
    public void basicBike() {
        Bike basicBike = new BasicBike();
        assertEquals(basicBike.assembleBike(),"Basic Bike...");
    }
    @Test
    public void sportsBike() {
        Bike sportsBike = new SportsBike(new BasicBike());
        assertEquals(sportsBike.assembleBike(),"Adding features of sports bike");
    }
}