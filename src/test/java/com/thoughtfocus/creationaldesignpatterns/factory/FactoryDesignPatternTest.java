package com.thoughtfocus.creationaldesignpatterns.factory;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryDesignPatternTest {
    @Test
    public void brands(){
        VehicalFactory vehicalFactory = new VehicalFactory();
        Vehical vehical = vehicalFactory.getResult("Bike");
        assertEquals("com.thoughtfocus.creationaldesignpatterns.factory.Bike@401e7803",vehical.toString());
    }

}