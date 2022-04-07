package com.thoughtfocus.creationaldesignpatterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements Vehical {
    private static Logger logger = LoggerFactory.getLogger(Car.class);

    @Override
    public char brands() {
        logger.info("Hyundai");
        logger.info("Audi");
        logger.info("Kia");
        logger.info("BMW");
        logger.info("Jaguar");
        logger.info("Ferrari");
        return 0;
    }

}
