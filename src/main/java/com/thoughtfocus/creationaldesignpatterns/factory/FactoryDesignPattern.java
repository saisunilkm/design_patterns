package com.thoughtfocus.creationaldesignpatterns.factory;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        VehicalFactory vehicalFactory = new VehicalFactory();
        Vehical vehical = vehicalFactory.getResult("Bike");
        vehical.brands();

    }
}
