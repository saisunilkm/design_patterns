package com.thoughtfocus.behavioraldesignpatterns.strategy;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StrategyDesignPatternTest {
    @Test
    public void additionOperation() {
        Operations operations = new Operations(new AddOperation());
        assertEquals(15, operations.executeOperation(10, 5));
    }

    @Test
    public void subtractionOperation() {
        Operations operations = new Operations(new SubtractOperation());
        assertEquals(1, operations.executeOperation(6, 5));
    }

    @Test
    public void multiplicationOperation() {
        Operations operations = new Operations(new MultiplyOperation());
        assertEquals(100, operations.executeOperation(20, 5));
    }

    @Test
    public void divisionOperation() {
        Operations operations = new Operations(new DivisionOperation());
        assertEquals(2, operations.executeOperation(4, 2));
    }

}