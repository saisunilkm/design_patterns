package com.thoughtfocus.behavioraldesignpatterns.visitor;

import org.junit.Test;

import static com.thoughtfocus.behavioraldesignpatterns.visitor.VehicleService.calculateTotal;
import static org.junit.jupiter.api.Assertions.*;

public class VisitorDesignPatternTest {

    @Test
    public void totalServiceCharge(){
        Vehicle[] vehicles = new Vehicle[]{
                new Car("Blue",2015),
                new Van(6000,4),
                new MotorBike(150,"Yehama")
        };

        int totalCost = calculateTotal(vehicles);
        assertEquals(200,totalCost);
    }

}