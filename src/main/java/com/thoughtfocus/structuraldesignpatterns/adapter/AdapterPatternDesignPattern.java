package com.thoughtfocus.structuraldesignpatterns.adapter;

public class AdapterPatternDesignPattern {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.getElement();
        chromeDriver.selectElement();

        IEDriver ieDriver = new IEDriver();
        ieDriver.findElement();
        ieDriver.clickElement();

        WebDriverAdapter wID = new WebDriverAdapter(ieDriver);
        wID.getElement();
        wID.selectElement();

    }
}
