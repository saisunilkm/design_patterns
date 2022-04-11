package com.thoughtfocus.behavioraldesignpatterns.chainofresponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChainOfResponsibilityDesignPatternTest {
    @Test
    public void addNumbers(){
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new MultiplyNumbers();
        Chain chainCal3 = new DivideNumbers();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);
        Numbers request = new Numbers(10,5,"add");

        assertEquals(15,chainCal1.calculate(request));
    }
    @Test
    public void divideNumbers(){
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new MultiplyNumbers();
        Chain chainCal3 = new DivideNumbers();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);
        Numbers request = new Numbers(20,5,"div");

        assertEquals(4,chainCal3.calculate(request));
    }
    @Test
    public void MultiplyNumbers() {
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new MultiplyNumbers();
        Chain chainCal3 = new DivideNumbers();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);
        Numbers request = new Numbers(20, 5, "mult");

        assertEquals(100, chainCal2.calculate(request));
    }
    @Test
    public void ZeroShouldCome() {
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new MultiplyNumbers();
        Chain chainCal3 = new DivideNumbers();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);

        Numbers request = new Numbers(40, 20, "mult");
        Numbers request1 = new Numbers(40, 20, "div");
        Numbers request2 = new Numbers(0,0,"add");
        assertEquals(0, chainCal1.calculate(request));
        assertEquals(0, chainCal2.calculate(request1));
        assertEquals(0, chainCal3.calculate(request2));
    }

}