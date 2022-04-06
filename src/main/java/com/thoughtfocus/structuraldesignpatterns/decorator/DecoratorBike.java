package com.thoughtfocus.structuraldesignpatterns.decorator;

public class DecoratorBike implements Bike {
    private Bike bike;

    public DecoratorBike(Bike bike) {
        this.bike = bike;
    }

    @Override
    public void assembleBike() {
        bike.assembleBike();

    }
}
