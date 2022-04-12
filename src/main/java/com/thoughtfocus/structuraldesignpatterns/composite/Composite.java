package com.thoughtfocus.structuraldesignpatterns.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private static final Logger logger = LoggerFactory.getLogger(Composite.class);
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponents(Component component) {
        components.add(component);
    }

    @Override
    public String price() {
        logger.info(name);
        for (Component component : components) {
            component.price();
        }
        return "This is from composite price";
    }
}
