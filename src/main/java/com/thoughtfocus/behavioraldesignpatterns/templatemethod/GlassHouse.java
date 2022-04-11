package com.thoughtfocus.behavioraldesignpatterns.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlassHouse extends HouseTemplate{
    private static Logger logger = LoggerFactory.getLogger(GlassHouse.class);
    @Override
    public String buildWalls() {
        logger.info("Building Glass Walls");
        return "This is from building walls in Glass House";
    }

    @Override
    public String buildPillars() {
        logger.info("Building Pillars with Glass Coating");
        return "This is from building pillars in Glass House";
    }
}
