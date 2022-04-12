package com.thoughtfocus.structuraldesignpatterns.adapter;

public class ChromeDriver implements WebDriver {
    @Override
    public String getElement() {
        return "Get element from chrome";
    }

    @Override
    public String selectElement() {
        return "Select element from chrome";
    }
}
