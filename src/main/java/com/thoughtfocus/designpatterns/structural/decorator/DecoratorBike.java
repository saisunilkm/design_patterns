package com.thoughtfocus.designpatterns.structural.decorator;

public class DecoratorBike implements Bike {
    private final Bike bike;

    public DecoratorBike(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String assembleBike() {
        return bike.assembleBike();

    }
}
