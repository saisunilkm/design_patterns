package com.thoughtfocus.designpatterns.behavioral.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VisitorDesignPatternTest {

    @Test
    void totalServiceCharge() {
        Vehicle[] vehicles = new Vehicle[]{
                new Car("Blue", 2015),
                new Van(6000, 4),
                new MotorBike(150, "Yehama")
        };

        int totalCost = VehicleService.calculateTotal(vehicles);
        assertEquals(200, totalCost);
    }
}