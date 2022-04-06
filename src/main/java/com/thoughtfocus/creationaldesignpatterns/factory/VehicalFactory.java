package com.thoughtfocus.creationaldesignpatterns.factory;

public class VehicalFactory {
    public Vehical getResult(String str){
        if(str.equals("Bike")){
            return new Bike();
        }else if(str.equals("Car")){
            return new Car();
        }else
            return null;
    }
}
