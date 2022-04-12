package com.thoughtfocus.designpatterns.structural.bridge;

import com.thoughtfocus.designpatterns.structural.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BridgeDesignPatternTest {
    @Test
    void bridgeTest() {
        Tv sonyNewRemote = new Sony(new NewRemote());
        assertEquals(sonyNewRemote.On(), "New Remote On. Sony Tv is On");
        assertEquals(sonyNewRemote.Off(), "New Remote Off. Sony Tv is Off");

        Tv onePlusOldRemote = new OnePlus(new OldRemote());
        assertEquals(onePlusOldRemote.On(), "Old Remote On. OnePlus Tv is On");
        assertEquals(onePlusOldRemote.Off(), "Old Remote Off. OnePlus Tv is Off");
    }

}