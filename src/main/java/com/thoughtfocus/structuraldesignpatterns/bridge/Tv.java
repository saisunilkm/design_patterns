package com.thoughtfocus.structuraldesignpatterns.bridge;

public abstract class Tv {
    protected Remote remote;

    public Tv(Remote r){
        this.remote=r;
    }

    abstract public String On();
    abstract public String Off();
}
