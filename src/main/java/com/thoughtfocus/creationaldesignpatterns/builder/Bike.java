package com.thoughtfocus.creationaldesignpatterns.builder;

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
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", cc=" + cc +
                ", price=" + price +
                ", noOfStrokes=" + noOfStrokes +
                '}';
    }
}
