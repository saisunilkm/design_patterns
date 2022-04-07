package com.thoughtfocus.creationaldesignpatterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bike implements Vehical {
    private static Logger logger = LoggerFactory.getLogger(Bike.class);

    @Override
    public char brands() {
        logger.info("Royal Enfield");
        logger.info("Yamaha");
        logger.info("KTM");
        logger.info("TVS");
        return 0;
    }

}
