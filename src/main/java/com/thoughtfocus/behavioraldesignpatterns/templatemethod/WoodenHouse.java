package com.thoughtfocus.behavioraldesignpatterns.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WoodenHouse extends HouseTemplate{
    private static Logger logger = LoggerFactory.getLogger(WoodenHouse.class);
    @Override
    public String buildWalls() {
        logger.info("Building Wooden Walls");
        return "This is from building walls in Wooden House";
    }

    @Override
    public String buildPillars() {
        logger.info("Building Pillars with Wood coating");
        return "This is from building pillars in Wooden House";
    }
}
