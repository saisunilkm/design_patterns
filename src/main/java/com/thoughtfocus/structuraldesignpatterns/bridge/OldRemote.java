package com.thoughtfocus.structuraldesignpatterns.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OldRemote implements Remote {

    @Override
    public String remoteOn() {
        return "Old Remote On.";
    }

    @Override
    public String remoteOff() {
        return "Old Remote Off.";
    }
}
