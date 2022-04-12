package com.thoughtfocus.designpatterns.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StateDesignPatternTest {
    @Test
    void stateDesignPatternTest() {
        Package pkg = new Package();
        assertEquals(pkg.printStatus(), "Package ordered, not delivered to the office yet.");

        pkg.nextState();
        assertEquals(pkg.printStatus(), "Package delivered to the post office,not received yet.");

        pkg.nextState();
        assertEquals(pkg.printStatus(), "Package has been received");

        pkg.setState(new DeliveredState());
        pkg.previousState();

        assertEquals(pkg.printStatus(), "Package ordered, not delivered to the office yet.");
    }

}