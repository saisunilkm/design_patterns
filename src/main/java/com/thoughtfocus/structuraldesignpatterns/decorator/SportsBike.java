package com.thoughtfocus.structuraldesignpatterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SportsBike extends DecoratorBike {
    private static Logger logger = LoggerFactory.getLogger(SportsBike.class);
    public SportsBike(Bike bike) {
        super(bike);
    }

    @Override
    public void assembleBike() {
        super.assembleBike();
        logger.info("Adding features of sports bike");
    }
}
