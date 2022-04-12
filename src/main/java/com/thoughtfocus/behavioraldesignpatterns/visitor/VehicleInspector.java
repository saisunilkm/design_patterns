package com.thoughtfocus.behavioraldesignpatterns.visitor;

public interface VehicleInspector {
    int visit(Car car);

    int visit(Van van);

    int visit(MotorBike motorBike);
}
