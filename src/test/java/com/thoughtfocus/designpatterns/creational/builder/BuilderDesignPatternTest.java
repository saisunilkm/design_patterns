package com.thoughtfocus.designpatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuilderDesignPatternTest {
    @Test
    void builder() {
        Bike bike = new BikeBuilder().setBrand("Yemaha").setCc(150).setNoOfStrokes(4).getBike();
        assertEquals("Bike: brand=Yemaha, cc =150, price =0.0, noOfStrokes4", bike.toString());
    }
}