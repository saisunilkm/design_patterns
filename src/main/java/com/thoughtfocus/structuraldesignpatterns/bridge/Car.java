package com.thoughtfocus.structuraldesignpatterns.bridge;

import com.thoughtfocus.structuraldesignpatterns.adapter.AppleCharger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car extends Automobile {
    private static Logger logger = LoggerFactory.getLogger(Car.class);
    public Car (WorkShop workShop1, WorkShop workShop2){
        super(workShop1,workShop2);
    }
    @Override
    public void manufacture() {
        logger.info(" Car is ");
        workShop1.work();
        workShop2.work();

    }
}
