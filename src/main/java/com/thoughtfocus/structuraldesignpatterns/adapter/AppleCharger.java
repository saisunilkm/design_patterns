package com.thoughtfocus.structuraldesignpatterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppleCharger implements Chargeable {
    private static Logger logger = LoggerFactory.getLogger(AppleCharger.class);
    String mobileName;

    @Override
    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    @Override
    public void charge() {

        logger.info("Charging"+" "+this.mobileName+"...");

    }
}
