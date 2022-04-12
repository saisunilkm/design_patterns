package com.thoughtfocus.designpatterns.behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MementoTest {
    @Test
    void shouldGetOriginalContentBackAfterChangingTheContent() {

        Life life = new Life();

        assertEquals("Setting time to 100.b.c", life.set("100.b.c"));

        Memento memento = life.saveToMemento();

        assertEquals("Setting time to 200.b.c", life.set("200.b.c"));

        assertEquals("Time restored from Memento: 100.b.c", life.restoreFromMemento(memento));

    }

}