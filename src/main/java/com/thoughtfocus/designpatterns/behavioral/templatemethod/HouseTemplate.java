package com.thoughtfocus.designpatterns.behavioral.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class HouseTemplate {
    private static Logger logger = LoggerFactory.getLogger(HouseTemplate.class);

    public final String buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        return "House is built.";
    }
    private void buildWindows(){
        logger.info("Building Glass Windows");
    }

    public abstract String buildWalls();
    public abstract String buildPillars();

    private void buildFoundation() {
        logger.info("Building foundation with cement,iron rods and sand");
    }
}
