package com.thoughtfocus.designpatterns.creational.builder;

public class Bike {
    private String brand;
    private int cc;
    private double price;
    private int noOfStrokes;

    public Bike(String brand,int cc,double price,int noOfStrokes){
        super();
        this.brand = brand;
        this.cc = cc;
        this.price = price;
        this.noOfStrokes = noOfStrokes;
    }

    @Override
    public String toString() {
        StringBuilder bike = new StringBuilder();
        bike.append("Bike: brand=").append(brand)
                .append(", cc =").append(cc)
                .append(", price =").append(price)
                .append(", noOfStrokes").append(noOfStrokes);
        String result = bike.toString();
        return result;
    }
}
