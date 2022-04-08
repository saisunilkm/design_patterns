package com.thoughtfocus.behavioraldesignpatterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderedState implements PackageState{
    private static Logger logger = LoggerFactory.getLogger(OrderedState.class);
    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        logger.info("The package is in root state");
    }

    @Override
    public String printStatus() {
        return "Package ordered, not delivered to the office yet.";
    }
}
