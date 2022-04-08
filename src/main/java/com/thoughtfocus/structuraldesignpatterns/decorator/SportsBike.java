package com.thoughtfocus.structuraldesignpatterns.decorator;

public class SportsBike extends DecoratorBike {
    public SportsBike(Bike bike) {
        super(bike);
    }

    @Override
    public String assembleBike() {
        super.assembleBike();
        return "Adding features of sports bike";
    }
}
