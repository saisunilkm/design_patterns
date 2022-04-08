package com.thoughtfocus.structuraldesignpatterns.decorator;

public class BasicBike implements Bike {

    @Override
    public String assembleBike() {
        return "Basic Bike...";
    }
}
