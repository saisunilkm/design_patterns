package com.thoughtfocus.designpatterns.behavioral.visitor;

public interface Vehicle {
    int accept(VehicleInspector vehicleInspector);
}
