package com.thoughtfocus.behavioraldesignpatterns.cor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainOfResponsibilityDesignPatternTest {
    @Test
    void addNumbers() {
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new MultiplyNumbers();
        Chain chainCal3 = new DivideNumbers();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);

        Numbers request = new Numbers(10, 5, "add");
        assertEquals(15, chainCal1.calculate(request));

        Numbers request1 = new Numbers(20, 5, "div");
        assertEquals(4, chainCal3.calculate(request1));

        Numbers request2 = new Numbers(20, 5, "mult");
        assertEquals(100, chainCal2.calculate(request2));
    }
}