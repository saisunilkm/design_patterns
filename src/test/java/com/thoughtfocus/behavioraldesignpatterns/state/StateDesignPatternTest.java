package com.thoughtfocus.behavioraldesignpatterns.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StateDesignPatternTest {
    @Test
    public void givenNewPackage_AfterGoingToNextState_StatusShouldBeDeliveredAndThenReceived() {
        Package pkg =new Package();
        assertEquals(pkg.printStatus(),"Package ordered, not delivered to the office yet.");

        pkg.nextState();
        assertEquals(pkg.printStatus(),"Package delivered to the post office,not received yet.");

        pkg.nextState();
        assertEquals(pkg.printStatus(),"Package has been received");

        pkg.nextState();
    }
    @Test
    public void givenDeliveredState_previousStateStatus_ShouldBeOrderedState(){
        Package pkg =new Package();
        pkg.setState(new DeliveredState());
        pkg.previousState();

        assertEquals(pkg.printStatus(),"Package ordered, not delivered to the office yet.");
    }

}