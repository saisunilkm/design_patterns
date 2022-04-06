package com.thoughtfocus.structuraldesignpatterns.composite;

public class CompositeDesignPattern {
    public static void main(String[] args) {
        Component mouse = new Leaf("Mouse",500.00);
        Component keyboard = new Leaf("Keyboard",1000.00);
        Component speaker = new Leaf("Speaker",300.00);
        Component hardDisk = new Leaf("HardDisk",3000.00);
        Component CPU = new Leaf("CPU",5000.00);
        Component RAM = new Leaf("RAM",4000.00);

        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");
        Composite peripherals = new Composite("Peripherals");

        cabinet.addComponents(hardDisk);
        cabinet.addComponents(motherBoard);
        peripherals.addComponents(mouse);
        peripherals.addComponents(keyboard);
        peripherals.addComponents(speaker);

        motherBoard.addComponents(CPU);
        motherBoard.addComponents(RAM);

        computer.addComponents(peripherals);
        computer.addComponents(cabinet);

    //    peripherals.price();
        computer.price();


    }
}
