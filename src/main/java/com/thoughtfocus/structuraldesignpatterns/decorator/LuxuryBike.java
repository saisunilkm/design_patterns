package com.thoughtfocus.structuraldesignpatterns.decorator;

import com.thoughtfocus.structuraldesignpatterns.adapter.AppleCharger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuxuryBike extends DecoratorBike {
    private static Logger logger = LoggerFactory.getLogger(LuxuryBike.class);
    public LuxuryBike(Bike bike) {
        super(bike);
    }

    @Override
    public void assembleBike() {
        super.assembleBike();
        logger.info("Adding features to Luxury Bike");
    }
}
