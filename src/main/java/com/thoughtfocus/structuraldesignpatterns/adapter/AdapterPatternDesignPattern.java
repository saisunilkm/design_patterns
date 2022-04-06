package com.thoughtfocus.structuraldesignpatterns.adapter;

public class AdapterPatternDesignPattern {
    public static void main(String[] args) {
        Chargeable appleCharger = new AppleCharger();
        appleCharger.setMobileName("IPhone");
        ChargerUtils.doCharge(appleCharger);

        Charger samsungCharger = new SamsungCharger();
        samsungCharger.setMobileName("Samsung M51");


        AppleAdapter appleAdapter = new AppleAdapter();
        appleAdapter.setSamsungCharger(samsungCharger);

        ChargerUtils.doCharge(appleAdapter);
    }
}
