package com.thoughtfocus.structuraldesignpatterns.bridge;
/**
The Bridge Design Pattern comes under Structural Design Patterns. This Bridge Design Patterns will allow to separate
the abstraction from the implementation. I have created the classes for Automobile(abstract),Bike, Car,
Workshop(interface), Produce and Manufacture and Main class.

Bike and Car classes is extends with Automobile(abstract) Class. Produce and Manufacture classes will implements
Workshop(interface) class. I have invoked Workshop class using super keyword in Automobile, bike and car classes.

 */