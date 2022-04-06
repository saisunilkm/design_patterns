package com.thoughtfocus.structuraldesignpatterns.bridge;

import com.thoughtfocus.structuraldesignpatterns.adapter.AppleCharger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bike extends Automobile {
    private static Logger logger = LoggerFactory.getLogger(Bike.class);
    public Bike (WorkShop workShop1, WorkShop workShop2){
        super(workShop1,workShop2);
    }
    @Override
    public void manufacture() {
        logger.info("Bike is ");
        workShop1.work();
        workShop2.work();

    }
}
