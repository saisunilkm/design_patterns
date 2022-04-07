package com.thoughtfocus.structuraldesignpatterns.decorator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorDesignPatternTest {
    @Test
    public void basicBike(){
        Bike basicBike = new BasicBike();
        basicBike.assembleBike();
    }
//    Bike basicBike = new BasicBike();
//        basicBike.assembleBike();
//        logger.info(".......................");

//    Bike luxuryBike = new LuxuryBike(new BasicBike());
//        luxuryBike.assembleBike();
//        logger.info("......................");
//
//    Bike sportsBike = new SportsBike(new LuxuryBike(new BasicBike()));
//        sportsBike.assembleBike();

}