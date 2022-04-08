package com.thoughtfocus.structuraldesignpatterns.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Leaf implements Component {
    private static Logger logger = LoggerFactory.getLogger(Leaf.class);
    String name;
    double price;

    public Leaf(String name,double price) {
        super();
        this.name = name;
        this.price = price;
    }
    @Override
    public String price() {
        logger.info(name + " : "+ price);

        return price();
    }
}
