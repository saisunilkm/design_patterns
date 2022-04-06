package com.thoughtfocus.structuraldesignpatterns.proxy;

import com.thoughtfocus.structuraldesignpatterns.adapter.AppleCharger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealInternet implements Internet {
    private static Logger logger = LoggerFactory.getLogger(RealInternet.class);
    @Override
    public void connectTo(String serverhost) throws Exception {
        logger.info("Connecting to " + serverhost);
    }
}
