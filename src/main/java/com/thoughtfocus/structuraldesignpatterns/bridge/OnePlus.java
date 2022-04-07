package com.thoughtfocus.structuraldesignpatterns.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnePlus extends Tv {

    public OnePlus(Remote remote) {
        super(remote);
    }

    @Override
    public String On() {
        return remote.remoteOn() +onePlusTvOn();
    }
    private String onePlusTvOn(){
        return " OnePlus Tv is On";
    }

    @Override
    public String Off() {
        return remote.remoteOff() +onePlusTvOff();
    }
    private String onePlusTvOff(){
        return " OnePlus Tv is Off";
    }
}
