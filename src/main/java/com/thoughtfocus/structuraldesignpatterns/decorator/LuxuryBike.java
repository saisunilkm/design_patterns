package com.thoughtfocus.structuraldesignpatterns.decorator;

public class LuxuryBike extends DecoratorBike {
    public LuxuryBike(Bike bike) {
        super(bike);
    }

    @Override
    public String assembleBike() {
        return super.assembleBike() + luxuryBikeFeatures();
    }
    private String luxuryBikeFeatures(){
        return "With Luxury Bike Features";
    }

}
