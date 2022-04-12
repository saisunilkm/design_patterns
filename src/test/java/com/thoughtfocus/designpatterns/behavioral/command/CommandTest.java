package com.thoughtfocus.designpatterns.behavioral.command;

import com.thoughtfocus.designpatterns.behavioral.command.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {
    @Test
    void commandTest() {

        Light livingRoomLight = new Light();

        Fan livingRoomFan = new Fan();

        HomeAutomationRemote remote = new HomeAutomationRemote();

        remote.setCommand(new TurnOnLightCommand(livingRoomLight));
        assertEquals("Turning on light.Light is On", remote.buttonPressed());

        remote.setCommand(new TurnOffLightCommand(livingRoomLight));
        assertEquals("Turning off light.Light is Off", remote.buttonPressed());

        remote.setCommand(new StartFanCommand(livingRoomFan));
        assertEquals("Starting fan...Fan started...", remote.buttonPressed());

        remote.setCommand(new StopFanCommand(livingRoomFan));
        assertEquals("Stopping fan...Fan stopped...", remote.buttonPressed());

    }


}