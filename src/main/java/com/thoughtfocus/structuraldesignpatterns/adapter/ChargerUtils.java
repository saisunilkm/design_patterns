package com.thoughtfocus.structuraldesignpatterns.adapter;

public class ChargerUtils {
    public static void doCharge(Chargeable chargeable){
        chargeable.charge();
    }
}
