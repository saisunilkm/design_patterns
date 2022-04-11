package com.thoughtfocus.behavioraldesignpatterns.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemplateMethodDesignPatternTest {

    @Test
    public void inWoodenHouse(){
        WoodenHouse woodenHouse = new WoodenHouse();
        assertEquals("This is from building walls in Wooden House",woodenHouse.buildWalls());
        assertEquals("This is from building pillars in Wooden House",woodenHouse.buildPillars());
    }

    @Test
    public void inGlassHouse(){
        GlassHouse glassHouse = new GlassHouse();
        assertEquals("This is from building walls in Glass House",glassHouse.buildWalls());
        assertEquals("This is from building pillars in Glass House",glassHouse.buildPillars());
    }

    @Test
    public void woodenHouse(){
        HouseTemplate houseTemplate = new WoodenHouse();
        houseTemplate.buildHouse();
    }

    @Test
    public void glassHouse(){
        HouseTemplate houseTemplate = new GlassHouse();
        houseTemplate.buildHouse();
    }

}