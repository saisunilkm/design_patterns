package com.thoughtfocus.designpatterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrategyDesignPatternTest {
    @Test
    void strategyTest() {
        Operations operations = new Operations(new AddOperation());
        assertEquals(15, operations.executeOperation(10, 5));

        Operations operations1 = new Operations(new SubtractOperation());
        assertEquals(1, operations1.executeOperation(6, 5));

        Operations operations2 = new Operations(new MultiplyOperation());
        assertEquals(100, operations2.executeOperation(20, 5));

        Operations operations3 = new Operations(new DivisionOperation());
        assertEquals(2, operations3.executeOperation(4, 2));
    }
}