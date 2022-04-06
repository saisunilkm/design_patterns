package com.thoughtfocus.structuraldesignpatterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SamsungCharger implements Charger {
    private static Logger logger = LoggerFactory.getLogger(SamsungCharger.class);
    String mobileName;
    @Override
    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    @Override
    public void supplyCharge() {
        logger.info("Charging"+" "+this.mobileName+"...");
    }
}
