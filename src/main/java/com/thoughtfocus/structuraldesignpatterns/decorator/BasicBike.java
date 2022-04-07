package com.thoughtfocus.structuraldesignpatterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicBike implements Bike {
    private static Logger logger = LoggerFactory.getLogger(BasicBike.class);
    @Override
    public void assembleBike() {
        logger.info("Basic Bike...");
    }
}
