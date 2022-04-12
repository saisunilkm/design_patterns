package com.thoughtfocus.behavioraldesignpatterns.visitor;

public class MotorBike implements Vehicle{

    private int engineCapacity;
    private String brand;

    public MotorBike(int engineCapacity, String brand) {
        this.engineCapacity = engineCapacity;
        this.brand = brand;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int accept(VehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }
}
