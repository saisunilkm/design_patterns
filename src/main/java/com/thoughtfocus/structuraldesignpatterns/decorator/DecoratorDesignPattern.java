package com.thoughtfocus.structuraldesignpatterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoratorDesignPattern {
    private static Logger logger = LoggerFactory.getLogger(DecoratorDesignPattern.class);
    public static void main(String[] args) {
        Bike basicBike = new BasicBike();
        basicBike.assembleBike();
        logger.info(".......................");

        Bike luxuryBike = new LuxuryBike(new BasicBike());
        luxuryBike.assembleBike();
        logger.info("......................");

        Bike sportsBike = new SportsBike(new LuxuryBike(new BasicBike()));
        sportsBike.assembleBike();

    }
}
