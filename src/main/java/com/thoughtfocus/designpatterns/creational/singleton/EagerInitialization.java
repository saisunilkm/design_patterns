package com.thoughtfocus.designpatterns.creational.singleton;

public class EagerInitialization {
    private static EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){}

    public static EagerInitialization getInstance(){
        return instance;
    }
}
