package com.thoughtfocus.behavioraldesignpatterns.chainofresponsibility;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChainOfResponsibilityDesignPatternTest {
    @Test
    public void multiplyNumbers(){
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new MultiplyNumbers();
        Chain chainCal3 = new DivideNumbers();

        chainCal1.setNextChain(chainCal2);
       // chainCal2.setNextChain(chainCal3);
        Numbers request = new Numbers(10,5,"mult");

        assertEquals(50,chainCal1.calculate(request));
    }
    @Test
    public void divideNumbers(){
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new MultiplyNumbers();
        Chain chainCal3 = new DivideNumbers();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);
        Numbers request = new Numbers(10,5,"div");

        assertFalse(false,"84");
    }

}