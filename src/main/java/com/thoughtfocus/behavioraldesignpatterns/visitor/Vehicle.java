package com.thoughtfocus.behavioraldesignpatterns.visitor;

public interface Vehicle {
    int accept(VehicleInspector vehicleInspector);
}
