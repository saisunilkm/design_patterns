package com.thoughtfocus.structuraldesignpatterns.adapter;

public class WebDriverAdapter implements WebDriver {
    IEDriver ieDriver;

    public WebDriverAdapter(IEDriver ieDriver) {
        this.ieDriver = ieDriver;
    }

    @Override
    public String getElement() {
        return ieDriver.findElement();
    }

    @Override
    public String selectElement() {
        return ieDriver.clickElement();
    }
}
