package com.thoughtfocus.designpatterns.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterPatternDesignPatternTest {
    @Test
    void adapterTest() {
        ChromeDriver chromeDriver = new ChromeDriver();
        assertEquals("Get element from chrome", chromeDriver.getElement());
        assertEquals("Select element from chrome", chromeDriver.selectElement());

        IEDriver ieDriver = new IEDriver();
        WebDriverAdapter wID = new WebDriverAdapter(ieDriver);

        assertEquals("Find element from IEDriver", wID.getElement());
        assertEquals("click element from IEDriver", wID.selectElement());

        assertEquals("Find element from IEDriver", ieDriver.findElement());
        assertEquals("click element from IEDriver", ieDriver.clickElement());

    }

}