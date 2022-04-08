package com.thoughtfocus.structuraldesignpatterns.decorator;

public class LuxuryBike extends DecoratorBike {
    public LuxuryBike(Bike bike) {
        super(bike);
    }

    @Override
    public String assembleBike() {
        super.assembleBike();
        return "Adding features to Luxury Bike";
    }
}
