package com.thoughtfocus.structuraldesignpatterns.bridge;

import com.thoughtfocus.structuraldesignpatterns.adapter.AppleCharger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Produce implements WorkShop {
    private static Logger logger = LoggerFactory.getLogger(Produce.class);
    @Override
    public void work() {
        logger.info("Produced and ");
    }
}
