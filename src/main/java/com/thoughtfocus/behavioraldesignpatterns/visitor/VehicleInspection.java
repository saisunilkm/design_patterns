package com.thoughtfocus.behavioraldesignpatterns.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VehicleInspection implements VehicleInspector {
    private static final Logger logger = LoggerFactory.getLogger(VehicleInspection.class);

    @Override
    public int visit(Car car) {
        int serviceCharge = 0;
        if (car.getColor() == "Black") {
            serviceCharge += 100;
        } else {
            serviceCharge += 50;
        }
        logger.info("Service Charge for Car:" + serviceCharge);
        return serviceCharge;
    }

    @Override
    public int visit(Van van) {
        int serviceCharge = 0;
        if (van.getNumberOfDoors() > 4) {
            serviceCharge += 500;
        } else {
            serviceCharge += 100;
        }
        logger.info("Service Charge for Var: {}",serviceCharge);
        return serviceCharge;
    }

    @Override
    public int visit(MotorBike motorBike) {
        int serviceCharge = 0;
        if (motorBike.getEngineCapacity() >= 200) {
            serviceCharge += 200;
        } else {
            serviceCharge += 50;
        }
        logger.info("Service Charge for MotorBike: {}",serviceCharge);
        return serviceCharge;
    }
}
