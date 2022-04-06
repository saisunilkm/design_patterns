package com.thoughtfocus.structuraldesignpatterns.bridge;

import com.thoughtfocus.structuraldesignpatterns.adapter.AppleCharger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assemble implements WorkShop {
    private static Logger logger = LoggerFactory.getLogger(Assemble.class);
    @Override
    public void work() {
        logger.info("Assembled");
    }
}
