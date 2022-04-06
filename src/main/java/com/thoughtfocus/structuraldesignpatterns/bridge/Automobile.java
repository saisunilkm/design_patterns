package com.thoughtfocus.structuraldesignpatterns.bridge;

public abstract class Automobile {
    public WorkShop workShop1;
    public WorkShop workShop2;

    public Automobile(WorkShop workShop1, WorkShop workShop2){
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }
    abstract public void manufacture();
}
