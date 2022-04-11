package com.thoughtfocus.creationaldesignpatterns.factory;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryDesignPatternTest {

    @Test
    public void bikeBrands(){
        Vehical vehical = new Bike();
        assertEquals("This is from Bike brands",vehical.brands());
    }
    @Test
    public void carBrands(){
        Vehical vehical = new Car();
        assertEquals("This is from Car brands",vehical.brands());
    }

}