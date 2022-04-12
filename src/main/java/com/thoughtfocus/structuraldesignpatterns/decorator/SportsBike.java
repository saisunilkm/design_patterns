package com.thoughtfocus.structuraldesignpatterns.decorator;

public class SportsBike extends DecoratorBike {
    public SportsBike(Bike bike) {
        super(bike);
    }

    @Override
    public String assembleBike() {
        return super.assembleBike() + sportsBikeFeatures();
    }

    private String sportsBikeFeatures() {
        return "With Sports Bike Features";
    }
}
