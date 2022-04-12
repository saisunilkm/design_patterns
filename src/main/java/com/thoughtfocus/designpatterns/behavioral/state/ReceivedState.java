package com.thoughtfocus.designpatterns.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReceivedState implements PackageState{

    private static Logger logger = LoggerFactory.getLogger(ReceivedState.class);

    @Override
    public void next(Package pkg) {
        logger.info("This package is already received by Client");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public String printStatus() {
        return "Package has been received";
    }
}
