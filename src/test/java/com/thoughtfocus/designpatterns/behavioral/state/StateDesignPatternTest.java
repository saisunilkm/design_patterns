package com.thoughtfocus.designpatterns.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StateDesignPatternTest {
    @Test
    void stateDesignPatternTest() {
        Package pkg = new Package();
        assertEquals("Package ordered, not delivered to the office yet.", pkg.printStatus());

        pkg.nextState();
        assertEquals("Package delivered to the post office,not received yet.", pkg.printStatus());

        pkg.nextState();
        assertEquals("Package has been received", pkg.printStatus());

        pkg.setState(new DeliveredState());
        pkg.previousState();

        assertEquals("Package ordered, not delivered to the office yet.", pkg.printStatus());
    }

}