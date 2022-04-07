package com.thoughtfocus.structuraldesignpatterns.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sony extends Tv {
    public Sony(Remote remote) {
        super(remote);
    }

    @Override
    public String On() {
        return remote.remoteOn() +sonyTvOn();
    }
    private String sonyTvOn(){
        return " Sony Tv is On";
    }

    @Override
    public String Off() {
        return remote.remoteOff() +sonyTvOff();
    }
    private String sonyTvOff(){
        return " Sony Tv is Off";
    }
}
