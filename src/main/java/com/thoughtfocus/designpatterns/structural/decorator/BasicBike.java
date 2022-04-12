package com.thoughtfocus.designpatterns.structural.decorator;

public class BasicBike implements Bike {

    @Override
    public String assembleBike() {
        return "Basic Bike...";
    }
}
