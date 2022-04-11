package com.thoughtfocus.creationaldesignpatterns.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryDesignPatternTest {

    @Test
    void factoryTest(){
        Vehical vehical = new Bike();
        assertEquals("This is from Bike brands",vehical.brands());

        Vehical vehical1 = new Car();
        assertEquals("This is from Car brands",vehical1.brands());
    }

}