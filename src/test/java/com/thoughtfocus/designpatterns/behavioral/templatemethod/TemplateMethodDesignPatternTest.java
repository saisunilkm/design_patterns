package com.thoughtfocus.designpatterns.behavioral.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemplateMethodDesignPatternTest {

    @Test
    void templateMethodTest() {
        WoodenHouse woodenHouse = new WoodenHouse();
        assertEquals("This is from building walls in Wooden House", woodenHouse.buildWalls());
        assertEquals("This is from building pillars in Wooden House", woodenHouse.buildPillars());

        GlassHouse glassHouse = new GlassHouse();
        assertEquals("This is from building walls in Glass House", glassHouse.buildWalls());
        assertEquals("This is from building pillars in Glass House", glassHouse.buildPillars());
    }

}