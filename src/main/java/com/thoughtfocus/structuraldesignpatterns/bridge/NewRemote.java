package com.thoughtfocus.structuraldesignpatterns.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewRemote implements Remote {

    @Override
    public String remoteOn() {
        return "New Remote On.";
    }

    @Override
    public String remoteOff() {
        return "New Remote Off.";
    }
}
