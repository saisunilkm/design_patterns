package com.thoughtfocus.structuraldesignpatterns.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdapterPatternDesignPatternTest {
    @Test
    public void shouldGet_chromeDriver() {
        ChromeDriver chromeDriver = new ChromeDriver();
        assertEquals("Get element from chrome", chromeDriver.getElement());
        assertEquals("Select element from chrome", chromeDriver.selectElement());

    }
    @Test
    public void shouldGet_webDriverAdapter() {
        IEDriver ieDriver = new IEDriver();
        WebDriverAdapter wID = new WebDriverAdapter(ieDriver);
        assertEquals("Find element from IEDriver", wID.getElement());
        assertEquals("click element from IEDriver", wID.selectElement());
    }

    @Test
    public void shouldGet_ieDriver() {
        IEDriver ieDriver = new IEDriver();
        assertEquals("Find element from IEDriver", ieDriver.findElement());
        assertEquals("click element from IEDriver", ieDriver.clickElement());

    }

}