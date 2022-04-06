package com.thoughtfocus.creationaldesignpatterns.builder;

public class BikeBuilder {
    private String brand;
    private int cc;
    private double price;
    private int noOfStrokes;

    public BikeBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public BikeBuilder setCc(int cc) {
        this.cc = cc;
        return this;
    }

    public BikeBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public BikeBuilder setNoOfStrokes(int noOfStrokes) {
        this.noOfStrokes = noOfStrokes;
        return this;
    }

    public Bike getBike(){
        return new Bike (brand,cc,price,noOfStrokes);
    }
}
