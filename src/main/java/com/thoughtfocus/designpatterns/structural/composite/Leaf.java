package com.thoughtfocus.designpatterns.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Leaf implements Component {
    private static final Logger logger = LoggerFactory.getLogger(Leaf.class);
    String name;
    double price;

    public Leaf(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    @Override
    public String price() {
        logger.info(name + " : " + price);

        return "This is from leaf price";
    }
}
