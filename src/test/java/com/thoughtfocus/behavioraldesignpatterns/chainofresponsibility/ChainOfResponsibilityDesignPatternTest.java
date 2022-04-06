package com.thoughtfocus.behavioraldesignpatterns.chainofresponsibility;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChainOfResponsibilityDesignPatternTest {
    @Test
    public void add(){
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new MultiplyNumbers();
        Chain chainCal3 = new DivideNumbers();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);
        Numbers request = new Numbers(10,5,"mult");

        assertFalse(false,"23");
    }

}